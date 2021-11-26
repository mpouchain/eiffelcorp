package fr.uge.ifshare.database;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import fr.uge.ifshare.models.Product;

public class SellingByClientDB {
	private final Map<Long, List<Long>> sellBy;
	
	public SellingByClientDB() {
		this.sellBy = new HashMap<Long, List<Long>>();
	}

	public void addIdToClient(Long client, long idProduct) {
		if (!this.sellBy.containsKey(client)) {
			this.sellBy.put(client, new ArrayList<Long>());
		}
		this.sellBy.merge(client, List.of(idProduct), (list, elem) -> {
			list.addAll(elem);
			return list;
		});
	}
	

	public void removeidToClient(Product product) {
		Optional<Long> optClient = this.sellBy.entrySet().stream()
				.filter(entry -> entry.getValue().contains(product.getId()))
				.map(Map.Entry::getKey)
				.findFirst();
		Long client = optClient.get();
		this.sellBy.merge(client, List.of(product.getId()), (list, elem) -> {
			list.removeAll(elem);
			return list;
		});
	}
}
