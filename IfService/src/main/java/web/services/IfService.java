package web.services;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

import javax.xml.rpc.ServiceException;

import fr.uge.ifshare.service.IIfShareService;
import service.BankService;
import service.BankServiceServiceLocator;
import web.models.BankClient;
import web.models.Product;
import web.models.Rating;

public class IfService {
	private final List<Product> availableProducts;
	private BankService bankService;
	private IIfShareService ifShareService;
	
	public IfService() throws ServiceException, MalformedURLException, RemoteException, NotBoundException {
		this.availableProducts = Arrays.asList(new Product("Chaise rouge", 20, new Rating(5, 0)));
		this.bankService = new BankServiceServiceLocator().getBankService();
		this.ifShareService = (IIfShareService) Naming.lookup("rmi://localhost/IfShare");
	}
	
	public String getRmiProducts() throws RemoteException {
		StringBuilder sb = new StringBuilder();
		sb.append("RMI products : ");
		for(String product : ifShareService.getAllProductAlreadySold()) {
			sb.append(product).append("\n");
		}
		return sb.toString();
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
		sb.append("Products available : ");
		for(Product p : availableProducts) {
			sb.append(p).append("\n");
		}
		return sb.toString();			
	}
}
