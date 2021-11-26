package fr.uge.ifshare.database;

import java.util.ArrayList;
import java.util.List;

import fr.uge.ifshare.client.IfShareClient;

public class ClientDB {
	private final List<IfShareClient> listClients;

	public ClientDB() {
		this.listClients = new ArrayList<IfShareClient>();
	}
	
	public void addClient(IfShareClient client) {
		this.listClients.add(client);
	}
	
	public void removeClient(IfShareClient client) {
		this.listClients.remove(client);
	}
}
