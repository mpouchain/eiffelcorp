package fr.uge.ifshare.service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import fr.uge.ifshare.client.IIfShareClient;
import fr.uge.ifshare.database.ClientDB;
import fr.uge.ifshare.database.ClientWaitListDB;
import fr.uge.ifshare.database.ProductDB;
import fr.uge.ifshare.database.RatingsDB;
import fr.uge.ifshare.database.SellingByClientDB;
import fr.uge.ifshare.models.Product;

@SuppressWarnings("serial")
public class IfShareService extends UnicastRemoteObject implements IIfShareService {

	private final ClientDB clientDB;
	private final ProductDB productDB;
	private final ClientWaitListDB clientWaitListDB;
	private final SellingByClientDB sellingByClient;
	private final RatingsDB ratingDB;

	public IfShareService() throws RemoteException {
		super();
		this.clientDB = new ClientDB();
		this.productDB = new ProductDB();
		this.clientWaitListDB = new ClientWaitListDB();
		this.sellingByClient = new SellingByClientDB();
		this.ratingDB = new RatingsDB();
	}

	@Override
	public long connectToServer(IIfShareClient client) throws RemoteException {
		return this.clientDB.addClient(client);
	}

	@Override
	public void disconnectToServer(long idClient) throws RemoteException {
		this.clientDB.removeClient(idClient);
	}

	private Optional<Product> buyProduct(long productId, long idClient) throws RemoteException {
		Optional<Product> optProduct = this.productDB.getProductById(productId);
		if (optProduct.isPresent()) {
			Product product = optProduct.get();
			this.clientWaitListDB.removeClientFromWaitList(this.productDB, productId, idClient);
			this.productDB.deleteProduct(product, productId);
			long idSellClient = this.sellingByClient.removeidToClient(product);
			this.clientDB.getClient(idSellClient).notifyProductIsSell(product);
		}
		return optProduct;
	}

	@Override
	public Product buyProductById(long productId, long idClient) throws RemoteException {
		Optional<Product> optProduct = this.buyProduct(productId, idClient);
		if (optProduct.isPresent()) {
			return optProduct.get();
		}
		return null;
	}

	@Override
	public Product buyProductByType(String productType, long idClient) throws RemoteException {
		Map<Product, List<Long>> mapProducts = this.productDB.getAllProductByType(productType);
		var opt = mapProducts.entrySet().stream().sorted(Map.Entry.comparingByKey()).findFirst();
		if (opt.isPresent()) {
			var optProduct = buyProduct(opt.get().getValue().get(0), idClient);
			if (optProduct.isPresent()) {
				return optProduct.get();
			}
		}
		this.clientWaitListDB.addClientToWaitList(productType, idClient);
		return null;

	}

	@Override
	public void sellProduct(Product product, Long idClient) throws RemoteException {
		product.setType();
		long id = this.productDB.addProduct(product);
		this.ratingDB.addNoteToType(product.getType(), product.getRating().getNote());
		this.sellingByClient.addIdToClient(idClient, id);
		List<Long> clientList = this.clientWaitListDB.getClientWaitingForProduct(product.getType());
		clientList.forEach(clientId -> {
			try {
				this.clientDB.getClient(clientId).notifyProductAvailable(product);
			} catch (RemoteException e) {
				e.printStackTrace();
			}
		});
	}

	@Override
	public Map<Product, List<Long>> getAllProduct() throws RemoteException {
		return this.productDB.getAllProduct();
	}

	@Override
	public Map<Product, List<Long>> getAllProductWithType(String type) throws RemoteException {
		return this.productDB.getAllProductByType(type.toLowerCase().replaceAll("\\s+$", ""));
	}

	@Override
	public long getPrice(long idProduct) throws RemoteException {
		var optProduct = this.productDB.getProductById(idProduct);
		if(optProduct.isPresent()) {
			return optProduct.get().getPrice();
		}
		return -1;
	}

	@Override
	public long getPrice(String productType) throws RemoteException {
		Map<Product, List<Long>> mapProducts = this.productDB.getAllProductByType(productType);
		var opt = mapProducts.entrySet().stream().sorted(Map.Entry.comparingByKey()).findFirst();
		if (opt.isPresent()) {
			return getPrice(opt.get().getValue().get(0));
		}
		return -1;
	}

	@Override
	public float getNoteOfProduct(String product) throws RemoteException {
		List<Integer> notes = this.ratingDB.getListOfNote(product);
		if(notes != null) {
			return (float) notes.stream().mapToInt(i -> i).sum() / (float) notes.size();
		}
		return -1;
	}
}
