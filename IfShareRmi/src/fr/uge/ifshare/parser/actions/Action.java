package fr.uge.ifshare.parser.actions;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.Optional;

import fr.uge.ifshare.client.IfShareClient;
import fr.uge.ifshare.service.IIfShareService;

public interface Action extends Serializable {	
	public void buildFromCommand(String[] command);
	
	public Optional<String> getError();
	
	public void executeAction(IIfShareService ifShareService, IfShareClient client, long idClient) throws RemoteException;
}
