package fr.uge.ifshare.client;

import java.rmi.Remote;
import java.rmi.RemoteException;

import fr.uge.ifshare.models.Product;

public interface IIfShareClient extends Remote {
	public void notifyProductAvailable(Product product) throws RemoteException;
	
	public void notifyProductIsSold(Product product) throws RemoteException;
}
