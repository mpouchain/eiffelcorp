package fr.uge.ifshare.parser.actions;

import java.rmi.RemoteException;

import fr.uge.ifshare.client.IfShareClient;
import fr.uge.ifshare.service.IIfShareService;

@SuppressWarnings("serial")
public class DisplayInfoClientAction implements Action {
	
	public static String usage() {
		return "Usage : @info";
	}
	
	@Override
	public void buildRequestFromCommand(String[] command) {
		// Nothing
	}

	@Override
	public String getError() {
		return "";
	}

	@Override
	public void executeAction(IIfShareService ifShareService, IfShareClient client, long idClient) throws RemoteException {
		System.out.println(client);
	}

}
