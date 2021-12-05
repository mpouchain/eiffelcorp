package fr.uge.corp.ifservice.web;

import java.util.ArrayList;
import java.util.List;

import fr.uge.corp.ifservice.common.Product;

public class Cart {
	private List<Product> cart = new ArrayList<>();
	
	public void addToCart(Product p) {
		cart.add(p);
	}
	
	public void emptyCart() {
		cart.clear();
	}
	
	public String getCartDescription() {
		StringBuilder sb = new StringBuilder();
		sb.append("Contenu du panier : ");
		for(Product p : cart) {
			sb.append(p).append("\n");
		}
		return sb.toString();
	}
	
	public Product[] getCart() {
		return cart.toArray(new Product[0]);
	}

}
