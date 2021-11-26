package fr.uge.ifshare.client;

import java.io.Serializable;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import fr.uge.ifshare.models.Product;
import fr.uge.ifshare.parser.ParseCommand;
import fr.uge.ifshare.service.IIfShareService;

public class IfShareClient implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private final IIfShareService ifShareService;
	private final ParseCommand parseCommand;
	private final List<Product> productSell;
	private long bank;
	
	public IfShareClient() throws MalformedURLException, RemoteException, NotBoundException {
		this.ifShareService = (IIfShareService) Naming.lookup("rmi://localhost/IfShare");
		this.parseCommand = new ParseCommand();
		this.productSell = new ArrayList<Product>();
		this.bank = 1_000;
	}

	public IIfShareService getIfShareService() {
		return ifShareService;
	}
	
	public ParseCommand getParseCommand() {
		return parseCommand;
	}
	
	public long getBank() {
		return bank;
	}
	
	public void addToBank(long value) {
		this.bank += value;
	}
	
	public void removeToBank(long value) {
		this.bank -= value;
	}
	
	public void addProductSell(Product product) {
		this.productSell.add(product);
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof IfShareClient)) { // compile pas
			return false;
		}
		IfShareClient client = (IfShareClient) o; // warning unchecked
		return client.ifShareService.equals(ifShareService);
	}

	@Override
	public int hashCode() {
		return ifShareService.hashCode();
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("Votre solde est de ")
			.append(bank)
			.append("€\n");
		if(this.productSell.isEmpty()) {
			str.append("Vous n'avez pas de produits en vente.");
		} else {
			str.append("Vous avez actuellement ces produits en vente :\n")
			.append(this.productSell.stream()
						.map(Product::toString)
						.collect(Collectors.joining("\n", "\t", "")));
		}
			
		return str.toString();
	}
}
