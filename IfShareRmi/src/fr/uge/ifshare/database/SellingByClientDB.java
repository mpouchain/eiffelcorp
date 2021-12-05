package fr.uge.ifshare.database;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import fr.uge.ifshare.models.Product;

public class SellingByClientDB {
	private final Map<Long, List<Long>> soldBy;
	
	public SellingByClientDB() {
		this.soldBy = new HashMap<Long, List<Long>>();
	}

	public void addIdToClient(Long client, long idProduct) {
		if (!this.soldBy.containsKey(client)) {
			this.soldBy.put(client, new ArrayList<Long>());
		}
		this.soldBy.merge(client, Arrays.asList(idProduct), (list, elem) -> {
			list.addAll(elem);
			return list;
		});
	}
	

	public long removeidToClient(Product product) {
		Optional<Long> optClient = this.soldBy.entrySet().stream()
				.filter(entry -> entry.getValue().contains(product.getId()))
				.map(Map.Entry::getKey)
				.findFirst();
		Long client = optClient.get();
		this.soldBy.merge(client, Arrays.asList(product.getId()), (list, elem) -> {
			list.removeAll(elem);
			return list;
		});
		return client;
	}
}
