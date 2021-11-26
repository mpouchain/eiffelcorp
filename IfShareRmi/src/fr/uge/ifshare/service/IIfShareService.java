package fr.uge.ifshare.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import java.util.Map;

import fr.uge.ifshare.client.IfShareClient;
import fr.uge.ifshare.models.Product;

public interface IIfShareService extends Remote {
	public void connectToServer(IfShareClient client) throws RemoteException;

	public void disconnectToServer(IfShareClient client) throws RemoteException;
	
	public Product buyProduct(long productId, IfShareClient client) throws RemoteException;
	
	public void sellProduct(Product product, IfShareClient client) throws RemoteException;
	
	public Map<Product, List<Long>> getAllProduct() throws RemoteException;
	
	public Map<Product, List<Long>> getAllProductWithType(String type) throws RemoteException;
}
