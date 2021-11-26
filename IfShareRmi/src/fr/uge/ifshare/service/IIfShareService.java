package fr.uge.ifshare.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import java.util.Map;

import fr.uge.ifshare.client.IfShareClient;
import fr.uge.ifshare.models.Product;

public interface IIfShareService extends Remote {
	public long connectToServer(IfShareClient client) throws RemoteException;

	public void disconnectToServer(long idClient) throws RemoteException;
	
	public Product buyProduct(long productId, long client) throws RemoteException;
	
	public void sellProduct(Product product, Long client) throws RemoteException;
	
	public Map<Product, List<Long>> getAllProduct() throws RemoteException;
	
	public Map<Product, List<Long>> getAllProductWithType(String type) throws RemoteException;
}
