package fr.uge.ifshare.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

import web.models.Product;

public interface IIfShareClient extends Remote {
	public void notifyProductAvailable(Product product) throws RemoteException;
	
	public void notifyProductIsSold(Product product) throws RemoteException;
}
