package fr.uge.ifshare.models;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;

@SuppressWarnings("serial")
public class Product implements Serializable, Comparator<Product>, Comparable<Product> {
	private long id;
	private final Rating rating;
	private String type;
	private long price;

	public Product(String type, long price, Rating rating) {
		this.type = Objects.requireNonNull(type);
		if (price < 0) {
			throw new IllegalArgumentException("Price must be positive");
		}
		this.rating = rating;
		this.price = price;
		this.id = -1;
	}
	
	public Rating getRating() {
		return rating;
	}

	public String getType() {
		return type;
	}

	public void setType() {
		this.type = this.type.toLowerCase();
		this.type = this.type.replaceAll("\\s+$", "");
	}

	public long getPrice() {
		return price;
	}

	public long getId() {
		return id;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return type + " à " + price + "€, avec un état de " + rating.getState() + "/5";
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Product)) { // compile pas
			return false;
		}
		Product product = (Product) o; // warning unchecked
		return product.price == price && product.type.equals(type) && product.getRating().getState() == rating.getState();
	}

	@Override
	public int hashCode() {
		return type.hashCode() ^ (int) price ^ this.rating.getState();
	}

	@Override
	public int compareTo(Product d) {
		return (int) (this.price - d.price);
	}

	@Override
	public int compare(Product arg0, Product arg1) {
		return (int) (arg0.price - arg1.price);
	}
}
