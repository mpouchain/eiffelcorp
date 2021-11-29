package fr.uge.ifshare.database;

import java.util.HashMap;
import java.util.Map;

import fr.uge.ifshare.client.IIfShareClient;

public class ClientDB {
	private final Map<Long, IIfShareClient> clientMap;
	private long indexClient = 1;

	public ClientDB() {
		this.clientMap = new HashMap<Long, IIfShareClient>();
	}
	
	public long addClient(IIfShareClient client) {
		this.clientMap.put(indexClient, client);
		return indexClient++;
	}
	
	public void removeClient(long id) {
		this.clientMap.remove(id);
	}
	
	public IIfShareClient getClient(long id) {
		return this.clientMap.get(id);
	}
}
