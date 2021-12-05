package web.models;

import java.util.ArrayList;
import java.util.List;

public class BankClient {
	private final int id;
	private List<Product> cart = new ArrayList<>();
	
	public BankClient(int id, double balance) {
		this.id = id;
	}
	
	public void addToCart(Product p) {
		this.cart.add(p);
	}
	
	public Product[] getCart() {
		return cart.toArray(new Product[0]);
	}
	
	public void emptyCart() {
		this.cart.clear();
	}
	
	public int getId() {
		return id;
	}
}