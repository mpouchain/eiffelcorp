package fr.uge.ifshare.service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import fr.uge.ifshare.client.IfShareClient;
import fr.uge.ifshare.database.ClientDB;
import fr.uge.ifshare.database.ClientWaitListDB;
import fr.uge.ifshare.database.ProductDB;
import fr.uge.ifshare.database.SellingByClientDB;
import fr.uge.ifshare.models.Product;

@SuppressWarnings("serial")
public class IfShareService extends UnicastRemoteObject implements IIfShareService {

	private final ClientDB clientDB;
	private final ProductDB productDB;
	private final ClientWaitListDB clientWaitListDB;
	private final SellingByClientDB sellingByClientDB;

	public IfShareService() throws RemoteException {
		super();
		this.clientDB = new ClientDB();
		this.productDB = new ProductDB();
		this.clientWaitListDB = new ClientWaitListDB();
		this.sellingByClientDB = new SellingByClientDB();
	}

	@Override
	public void connectToServer(IfShareClient client) throws RemoteException {
		this.clientDB.addClient(client);
	}

	@Override
	public void disconnectToServer(IfShareClient client) throws RemoteException {
		this.clientDB.removeClient(client);
	}

	@Override
	public Product buyProduct(long productId, IfShareClient client) throws RemoteException {
		Optional<Product> optProduct = this.productDB.getProductById(productId);
		if (optProduct.isPresent()) {
			Product product = optProduct.get();
			if(product.getPrice() > client.getBank()) {
				return product;
			}
			this.productDB.deleteProduct(product, productId);
			this.sellingByClientDB.removeidToClient(product);
			this.clientWaitListDB.removeClientFromList(productId, client);
			return product;
		} else {
			this.clientWaitListDB.addClientToList(productId, client);
			return null;
		}
	}

	@Override
	public void sellProduct(Product product, IfShareClient client) throws RemoteException {
		long id = this.productDB.addProduct(product);
		this.clientWaitListDB.registerProductIndex(id, product.getType());
		this.sellingByClientDB.adIdToClient(client, id);
		List<IfShareClient> clientList = this.clientWaitListDB.getClientWaitingForProduct(product.getType());
		if (!clientList.isEmpty()) {
			if (this.clientWaitListDB.clientWaitingForProduct(product.getType(), clientList.get(0))) {
				this.buyProduct(product.getId(), clientList.get(0));
			}
		}
	}

	@Override
	public Map<Product, List<Long>> getAllProduct() throws RemoteException {
		return this.productDB.getAllProduct();
	}

	@Override
	public Map<Product, List<Long>> getAllProductWithType(String type) throws RemoteException {
		return this.productDB.getAllProductByType(type);
	}
}
