package fr.uge.ifshare.database;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import fr.uge.ifshare.models.Product;

public class ProductDB {
	private final Map<Product, List<Long>> productMap;
	private final Set<String> productSet;
	private long idCount;

	public ProductDB() {
		this.productMap = new LinkedHashMap<Product, List<Long>>();
		this.productSet = new HashSet<String>();
		this.idCount = 1;
	}

	public long addProduct(Product product) {
		product.setId(idCount);
		this.productSet.add(product.getType());
		if (!productMap.containsKey(product)) {
			productMap.put(product, new ArrayList<Long>());
		}
		this.productMap.merge(product, Arrays.asList(idCount), (list, elem) -> {
			list.addAll(elem);
			return list;
		});
		return idCount++;
	}

	public boolean deleteProduct(Product product, long id) {
		if (this.containsProduct(product)) {
			this.productMap.merge(product, Arrays.asList(id), (list, elem) -> {
				list.removeAll(elem);
				return list;
			});
			return true;
		}
		return false;
	}

	private boolean containsProduct(Product product) {
		return this.productMap.containsKey(product) && !this.productMap.get(product).isEmpty();
	}

	private Map<Product, List<Long>> getAllProduct(String type) {
		return this.productMap.entrySet().stream()
				.filter(entry -> !entry.getValue().isEmpty())
				.filter(entry -> { 
					return type == null ? true : entry.getKey().getType().equals(type);
				})
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
	}

	public Map<Product, List<Long>> getAllProduct() {
		return getAllProduct(null);
	}

	public Map<Product, List<Long>> getAllProductByType(String type) {
		return getAllProduct(type);
	}

	public Optional<Product> getProductById(long id) {
		return this.productMap.entrySet().stream()
				.filter(entry -> entry.getValue().contains(id))
				.map(Map.Entry::getKey)
				.findFirst();
	}
	
	public Set<String> getAllProductSold() {
		return this.productSet;
	}
}
