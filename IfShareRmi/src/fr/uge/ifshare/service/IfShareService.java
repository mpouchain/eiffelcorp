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
	public long connectToServer(IfShareClient client) throws RemoteException {
		return this.clientDB.addClient(client);
	}

	@Override
	public void disconnectToServer(long idClient) throws RemoteException {
		this.clientDB.removeClient(idClient);
	}

	@Override
	public Product buyProduct(long productId, long client) throws RemoteException {
		Optional<Product> optProduct = this.productDB.getProductById(productId);
		if (optProduct.isPresent()) {
			Product product = optProduct.get();
			this.productDB.deleteProduct(product, productId);
			this.clientWaitListDB.removeClientFromList(productId, client);
			this.sellingByClientDB.removeidToClient(product);
			return product;
		} else {
			this.clientWaitListDB.addClientToList(productId, client);
			return null;
		}
	}

	@Override
	public void sellProduct(Product product, Long client) throws RemoteException {
		long id = this.productDB.addProduct(product);
		this.clientWaitListDB.registerProductIndex(id, product.getType());
		this.sellingByClientDB.addIdToClient(client, id);
		List<Long> clientList = this.clientWaitListDB.getClientWaitingForProduct(product.getType());
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
