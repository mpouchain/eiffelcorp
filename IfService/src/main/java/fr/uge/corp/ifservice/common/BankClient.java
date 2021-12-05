package fr.uge.corp.ifservice.common;

import java.util.ArrayList;
import java.util.List;

public class BankClient {
	private int id;
	private List<Product> cart = new ArrayList<>();
	
	
	public BankClient() {}
	
	public BankClient(int id) {
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
	
	public String description() {
		return "Client " + id;
	}
	
	@Override
	public boolean equals(Object obj) {
		return obj instanceof BankClient
				&& ((BankClient)obj).getId() == id;
	}
	
	@Override
	public int hashCode() {
		return Integer.valueOf(id).hashCode();
	}
}