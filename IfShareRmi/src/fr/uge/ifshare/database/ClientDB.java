package fr.uge.ifshare.database;

import java.util.HashMap;
import java.util.Map;

import fr.uge.ifshare.client.IfShareClient;

public class ClientDB {
	private final Map<Long, IfShareClient> clientMap;
	private long indexClient = 1;

	public ClientDB() {
		this.clientMap = new HashMap<Long, IfShareClient>();
	}
	
	public long addClient(IfShareClient client) {
		this.clientMap.put(indexClient, client);
		return indexClient++;
	}
	
	public void removeClient(long id) {
		this.clientMap.remove(id);
	}
	
	public IfShareClient getClient(long id) {
		return this.clientMap.get(id);
	}
}
