package fr.uge.ifshare.server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.ExportException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

import fr.uge.ifshare.client.IIfShareClient;
import fr.uge.ifshare.client.IfShareClient;
import fr.uge.ifshare.models.Product;
import fr.uge.ifshare.models.Rating;
import fr.uge.ifshare.service.IIfShareService;
import fr.uge.ifshare.service.IfShareService;

public class IfShareServer {
	
	
	
	public static void main(String[] args) throws RemoteException, MalformedURLException {
		IIfShareService ifShareService = new IfShareService();
		IIfShareClient ifShareClient1 = new IfShareClient();
		IIfShareClient ifShareClient2 = new IfShareClient();
		IIfShareClient ifShareClient3 = new IfShareClient();
		try {
			LocateRegistry.createRegistry(1099);
			Naming.rebind("rmi://localhost/IfShare", ifShareService);
			long id1 = ifShareService.connectToServer(ifShareClient1);
			long id2 = ifShareService.connectToServer(ifShareClient2);
			long id3 = ifShareService.connectToServer(ifShareClient3);
			ifShareService.sellProduct(new Product("Table de ping pong", 125, new Rating(3, 4)), id1);
			ifShareService.sellProduct(new Product("Collier de perle", 42, new Rating(5, 5)), id1);
			ifShareService.sellProduct(new Product("DVD Spider Man", 3, new Rating(5, 2)), id1);
			ifShareService.sellProduct(new Product("Chaise de jardin", 10, new Rating(4, 4)), id2);
			ifShareService.sellProduct(new Product("Pull en laine", 17, new Rating(5, 5)), id2);
			ifShareService.sellProduct(new Product("Chaise de jardin", 10, new Rating(3, 4)), id3);
			ifShareService.disconnectToServer(id1);
			ifShareService.disconnectToServer(id2);
			ifShareService.disconnectToServer(id3);
			UnicastRemoteObject.unexportObject(ifShareClient1, true);
			UnicastRemoteObject.unexportObject(ifShareClient2, true);
			UnicastRemoteObject.unexportObject(ifShareClient3, true);
			
			System.out.println("\nServeur démarré.\n");
			
			try (Scanner sc = new Scanner(System.in)) {
				while (sc.hasNextLine()) {	}
			}
		} catch (ExportException e) {
			System.out.println("Trouble: " + e);
		} finally {
			UnicastRemoteObject.unexportObject(ifShareService, true);
			System.out.println("Le serveur est éteint.");
		}
	}
}
