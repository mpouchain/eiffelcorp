package fr.uge.ifshare.server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

import fr.uge.ifshare.client.IfShareClient;
import fr.uge.ifshare.parser.ParseCommand;
import fr.uge.ifshare.service.IIfShareService;

public class IfShareServerClient {
	public static void main(String[] args) throws RemoteException, MalformedURLException, NotBoundException {
		IIfShareService ifShareService = null;
		IfShareClient ifShareClient = new IfShareClient();
		long id = -1;
		ParseCommand parseCommand = ifShareClient.getParseCommand();
		
		try (Scanner sc = new Scanner(System.in)) {
			ifShareService = (IIfShareService) Naming.lookup("rmi://localhost/IfShare");
			id = ifShareService.connectToServer(ifShareClient);
			System.out.println("\nVous êtes connecté au serveur.\n");
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				parseCommand.parseCommand(line, ifShareService, ifShareClient, id);
			}
		} catch (Exception e) {
			System.out.println("Un problème est survenu.");
		} finally {
			try {
				ifShareService.disconnectToServer(id);
			} catch (Exception e) {
				System.out.println("La connexion a été intérompue.");
			}
			UnicastRemoteObject.unexportObject(ifShareClient, true);
			System.out.println("\nVous êtes déconnecté du serveur.\n");
		}
	}
}
