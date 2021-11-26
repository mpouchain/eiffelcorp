package fr.uge.ifshare.server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.ExportException;

import fr.uge.ifshare.service.IIfShareService;
import fr.uge.ifshare.service.IfShareService;

public class IfShareServer {
	public static void main(String[] args) throws RemoteException, MalformedURLException {
		try {
			LocateRegistry.createRegistry(1099);
			IIfShareService ifShareService = new IfShareService();
			Naming.rebind("rmi://localhost/IfShare", ifShareService);
		} catch (ExportException e) {
			System.out.println("Trouble: " + e);
		}
	}
}
