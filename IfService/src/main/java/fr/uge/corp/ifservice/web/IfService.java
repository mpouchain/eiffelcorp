package fr.uge.corp.ifservice.web;

import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import javax.xml.rpc.ServiceException;

import fr.uge.corp.bank.web.BankService;
import fr.uge.corp.bank.web.BankServiceServiceLocator;
import fr.uge.corp.ifservice.common.Product;
import fr.uge.corp.ifservice.common.Rating;


public class IfService {
	private final List<Product> availableProducts;
	private final HashMap<Integer, Cart> carts = new HashMap<Integer, Cart>();
	private BankService bankService;
	//private final CurrencyServerSoap currencyServer;
	
	public IfService() throws ServiceException, MalformedURLException, RemoteException, NotBoundException {
		this.availableProducts = Arrays.asList(new Product("Chaise rouge", 40, new Rating(5, 1)), new Product("Table bleu", 200, new Rating(5, 2)), new Product("Pull en laine", 35, new Rating(4, 3)));
		this.bankService = new BankServiceServiceLocator().getBankService();
		carts.put(1, new Cart());
		carts.put(2, new Cart());
		carts.put(3, new Cart());
		//this.currencyServer = new CurrencyServerLocator().getCurrencyServerSoap();
	}
	
	/*
	
	private double convertFromEUR(String currency, double amount) {
		if (currency.equals("EUR")) {
			return amount;
		}
		try {
			return (double) (currencyServer.convert("", "EUR", currency, amount, true, "",
					CurncsrvReturnRate.curncsrvReturnRateNumber, "", ""));
		} catch (RemoteException e) {
			throw new RuntimeException(e);
		}
	}
	*/
	
	public Product[] getAvailableProducts() {
		return availableProducts.toArray(new Product[0]);
	}
	
	public void addToCart(int id, Product p) {
		carts.get(id).addToCart(p);
	}
	
	public void validateCart(int id) throws RemoteException {		
		Cart cart = carts.get(id);
		
		if(carts.get(id).getCart().length == 0) {
			return;
		}
		
		double cartValue = 0;
		for(Product p : cart.getCart()) {
			cartValue += p.getPrice();
		}
		if(!bankService.hasFunds(id, cartValue)) {
			throw new IllegalStateException("Client " + id + " can't validate his cart");
		}
		
		bankService.removeFunds(id, cartValue);
		cart.emptyCart();
	}
	
	public String description() {
		StringBuilder sb = new StringBuilder();
		sb.append("Products available : \n");
		for(Product p : availableProducts) {
			sb.append(p).append("\n");
		}
		return sb.toString();			
	}
	
	public Cart getCartById(int id) {
		return carts.get(id);
	}
}
