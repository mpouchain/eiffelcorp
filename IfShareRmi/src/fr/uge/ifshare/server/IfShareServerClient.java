package fr.uge.ifshare.server;

import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

import fr.uge.ifshare.client.IfShareClient;
import fr.uge.ifshare.parser.ParseCommand;
import fr.uge.ifshare.service.IIfShareService;

public class IfShareServerClient {
	public static void main(String[] args) throws RemoteException, MalformedURLException, NotBoundException {
		IfShareClient ifShareClient = new IfShareClient();
		IIfShareService ifShareService = ifShareClient.getIfShareService();
		ParseCommand parseCommand = ifShareClient.getParseCommand();
		
		try (Scanner sc = new Scanner(System.in)) {
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				parseCommand.parseCommand(line, ifShareService, ifShareClient);
			}
		} catch (Exception e) {
			System.out.println("Trouble " + e);
		} finally {
			ifShareService.disconnectToServer(ifShareClient);
		}
	}
}
