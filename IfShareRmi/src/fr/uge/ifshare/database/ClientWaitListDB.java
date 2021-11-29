package fr.uge.ifshare.database;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClientWaitListDB {
	private final Map<String, List<Long>> waitListMap;
	
	public ClientWaitListDB() {
		this.waitListMap = new HashMap<String, List<Long>>();
	}
	
	public void addClientToWaitList(String productType, long idClient) {
		if (!waitListMap.containsKey(productType)) {
			waitListMap.put(productType, new ArrayList<Long>());
		}
		this.waitListMap.merge(productType, List.of(idClient), (list, elem) -> {
			list.addAll(elem);
			return list;
		});
	}
	
	public void addClientToWaitList(ProductDB productDB, long productId, long idClient) {
		String productType = productDB.getProductById(productId).get().getType();
		if(productType != null) {
			addClientToWaitList(productType, idClient);
		}
	}

	public void removeClientFromWaitList(ProductDB productDB, long productId, long idClient) {
		String typeProduct = productDB.getProductById(productId).get().getType();
		System.out.println("AFTER GET BY ID");
		if(isClientWaitingForProduct(typeProduct, idClient)) {
			this.waitListMap.merge(typeProduct, List.of(idClient), (list, elem) -> {
				list.removeAll(elem);
				return list;
			});
		}
	}
	
	public List<Long> getClientWaitingForProduct(String productType) {
		if(this.waitListMap.containsKey(productType)) {
			return this.waitListMap.get(productType);
		} else {
			return List.of();
		}
	}
	
	public boolean isClientWaitingForProduct(String productType, long idClient) {
		return this.waitListMap.containsKey(productType) && this.waitListMap.get(productType).contains(idClient);
	}
}
