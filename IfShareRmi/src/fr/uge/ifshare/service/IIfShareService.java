package fr.uge.ifshare.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import java.util.Map;
import java.util.Set;

import fr.uge.ifshare.client.IIfShareClient;
import fr.uge.ifshare.models.Product;

public interface IIfShareService extends Remote {
	public long connectToServer(IIfShareClient client) throws RemoteException;

	public void disconnectToServer(long idClient) throws RemoteException;
	
	public Product buyProductById(long productId, long client) throws RemoteException;
	
	public Product buyProductByType(String productType, long idClient) throws RemoteException;
	
	public void sellProduct(Product product, Long client) throws RemoteException;
	
	public Map<Product, List<Long>> getAllProduct() throws RemoteException;
	
	public Map<Product, List<Long>> getAllProductWithType(String type) throws RemoteException;
	
	public long getPrice(long idProduct) throws RemoteException;
	
	public long getPrice(String productType) throws RemoteException;
	
	public float getNoteOfProduct(String product) throws RemoteException;

	public Set<Product> getAllProductAlreadySell();
}
