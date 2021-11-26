package fr.uge.ifshare.models;

import java.io.Serializable;
import java.util.Objects;

@SuppressWarnings("serial")
public class Product implements Serializable {
	private long id;
	private final String type;
	private long price;

	public Product(String type) {
		this(type, 0);
	}

	public Product(String type, long price) {
		this.type = Objects.requireNonNull(type);
		if (price < 0) {
			throw new IllegalArgumentException("Price must be positive");
		}
		this.price = price;
		this.id = -1;
	}

	public String getType() {
		return type;
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
		return type + " à " + price + "€";
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Product)) { // compile pas
			return false;
		}
		Product product = (Product) o; // warning unchecked
		return product.price == price && product.type.equals(type);
	}

	@Override
	public int hashCode() {
		return type.hashCode() ^ (int) price;
	}
}
