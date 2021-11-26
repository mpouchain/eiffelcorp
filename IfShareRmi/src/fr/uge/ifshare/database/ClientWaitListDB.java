package fr.uge.ifshare.database;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import fr.uge.ifshare.client.IfShareClient;

public class ClientWaitListDB {
	private final Map<String, List<IfShareClient>> waitListMap;
	private final Map<Long, String> indexMap;
	
	public ClientWaitListDB() {
		this.waitListMap = new HashMap<String, List<IfShareClient>>();
		this.indexMap = new HashMap<Long, String>();
	}
	
	public void addClientToList(long productId, IfShareClient client) {
		String productType = this.indexMap.get(productId);
		if (!waitListMap.containsKey(productType)) {
			waitListMap.put(productType, new ArrayList<IfShareClient>());
		}
		this.waitListMap.merge(productType, List.of(client), (list, elem) -> {
			list.addAll(elem);
			return list;
		});
	}
	
	public List<IfShareClient> getClientWaitingForProduct(String productType) {
		if(this.waitListMap.containsKey(productType)) {
			return this.waitListMap.get(productType);
		} else {
			return List.of();
		}
	}
	
	public boolean clientWaitingForProduct(String productType, IfShareClient client) {
		return this.waitListMap.containsKey(productType) && this.waitListMap.get(productType).contains(client);
	}

	public void removeClientFromList(long productId, IfShareClient client) {
		String typeProduct = this.indexMap.get(productId);
		if(this.waitListMap.containsKey(typeProduct) && this.waitListMap.get(typeProduct).contains(client)) {
			this.waitListMap.merge(typeProduct, List.of(client), (list, elem) -> {
				list.removeAll(elem);
				return list;
			});
		}
	}

	public void registerProductIndex(long id, String type) {
		this.indexMap.put(id, type);
	}
}
