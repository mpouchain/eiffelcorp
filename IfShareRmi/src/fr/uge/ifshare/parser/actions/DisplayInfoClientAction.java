package fr.uge.ifshare.parser.actions;

import java.rmi.RemoteException;
import java.util.Optional;

import fr.uge.ifshare.client.IfShareClient;
import fr.uge.ifshare.service.IIfShareService;

@SuppressWarnings("serial")
public class DisplayInfoClientAction implements Action {
	
	@Override
	public void buildRequestFromCommand(String[] command) {
		// Nothing
	}

	@Override
	public Optional<String> getError() {
		return Optional.empty();
	}

	@Override
	public void executeAction(IIfShareService ifShareService, IfShareClient client, long idClient) throws RemoteException {
		System.out.println(client);
	}

}
