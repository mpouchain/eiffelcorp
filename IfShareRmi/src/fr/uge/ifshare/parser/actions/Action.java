package fr.uge.ifshare.parser.actions;

import java.io.Serializable;
import java.rmi.RemoteException;

import fr.uge.ifshare.client.IfShareClient;
import fr.uge.ifshare.service.IIfShareService;

public interface Action extends Serializable {	
	public void buildRequestFromCommand(String[] command);
	
	public String getError();
	
	public void executeAction(IIfShareService ifShareService, IfShareClient client, long idClient) throws RemoteException;
}
