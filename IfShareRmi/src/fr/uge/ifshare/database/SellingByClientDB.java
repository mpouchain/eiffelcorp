package fr.uge.ifshare.database;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import fr.uge.ifshare.client.IfShareClient;
import fr.uge.ifshare.models.Product;

public class SellingByClientDB {
	private final Map<IfShareClient, List<Long>> sellBy;
	
	public SellingByClientDB() {
		this.sellBy = new HashMap<IfShareClient, List<Long>>();
	}

	public void adIdToClient(IfShareClient client, long idProduct) {
		if (!this.sellBy.containsKey(client)) {
			this.sellBy.put(client, new ArrayList<Long>());
		}
		this.sellBy.merge(client, List.of(idProduct), (list, elem) -> {
			list.addAll(elem);
			return list;
		});
	}
	

	public void removeidToClient(Product product) {
		Optional<IfShareClient> optClient = this.sellBy.entrySet().stream()
				.filter(entry -> entry.getValue().contains(product.getId())).map(Map.Entry::getKey).findFirst();
		if (optClient.isPresent()) {
			IfShareClient client = optClient.get();
			this.sellBy.merge(client, List.of(product.getId()), (list, elem) -> {
				list.removeAll(elem);
				return list;
			});
		}
	}
}
