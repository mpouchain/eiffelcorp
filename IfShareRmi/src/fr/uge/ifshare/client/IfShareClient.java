package fr.uge.ifshare.client;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import fr.uge.ifshare.models.Product;
import fr.uge.ifshare.parser.ParseCommand;

@SuppressWarnings("serial")
public class IfShareClient extends UnicastRemoteObject implements IIfShareClient {
	private final ParseCommand parseCommand;
	private final List<Product> productSell;
	private long bank;
	
	public IfShareClient() throws RemoteException{
		super();
		this.parseCommand = new ParseCommand();
		this.productSell = new ArrayList<Product>();
		this.bank = 1_000;
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
	
	public void removeFromBank(long value) {
		this.bank -= value;
	}
	
	public void addProductSell(Product product) {
		this.productSell.add(product);
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
			str.append("Vous avez actuellement ces produits en vente :\n\t")
			.append(this.productSell.stream()
						.map(Product::toString)
						.collect(Collectors.joining("\n\t")));
		}
			
		return str.toString();
	}

	@Override
	public void notifyProductAvailable(Product product) throws RemoteException {
		System.out.println("Le produit suivant est de nouveau disponible : " + product);
	}

	@Override
	public void notifyProductIsSell(Product product) throws RemoteException {
		System.out.println("Vous avez vendu ce produit : " + product);
		this.productSell.remove(product);
		this.addToBank(product.getPrice());
	}
}
