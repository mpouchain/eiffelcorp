package web.services;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

import javax.xml.rpc.ServiceException;

import com.currencysystem.webservices.currencyserver.CurncsrvReturnRate;
import com.currencysystem.webservices.currencyserver.CurrencyServerLocator;
import com.currencysystem.webservices.currencyserver.CurrencyServerSoap;

import service.BankService;
import service.BankServiceServiceLocator;
import web.models.BankClient;
import web.models.Product;
import web.models.Rating;

public class IfService {
	private final List<Product> availableProducts;
	private BankService bankService;
	private final CurrencyServerSoap currencyServer;
	
	public IfService() throws ServiceException, MalformedURLException, RemoteException, NotBoundException {
		this.availableProducts = Arrays.asList(new Product("Chaise rouge", 40, new Rating(5, 1)), new Product("Table bleu", 200, new Rating(5, 2)), new Product("Pull en laine", 35, new Rating(4, 3)));
		this.bankService = new BankServiceServiceLocator().getBankService();
		this.currencyServer = new CurrencyServerLocator().getCurrencyServerSoap();
	}
	
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
	
	public Product[] getAvailableProducts() {
		return availableProducts.toArray(new Product[0]);
	}
	
	public void addToCart(BankClient bc, Product p) {
		bc.addToCart(p);
	}
	
	public void validateCart(BankClient bc) throws RemoteException {
		List<Product> cart = Arrays.asList(bc.getCart());
		
		if(cart.isEmpty()) {
			return;
		}
		
		double cartValue = 0;
		for(Product p : cart) {
			cartValue += p.getPrice();
		}
		if(!bankService.hasFunds(bc.getId(), cartValue)) {
			throw new IllegalStateException("Client " + bc.getId() + " can't validate his cart");
		}
		
		bankService.removeFunds(bc.getId(), cartValue);
		bc.emptyCart();
	}
	
	public String description() {
		StringBuilder sb = new StringBuilder();
		sb.append("Products available : \n");
		for(Product p : availableProducts) {
			sb.append(p).append("\n");
		}
		return sb.toString();			
	}
}
