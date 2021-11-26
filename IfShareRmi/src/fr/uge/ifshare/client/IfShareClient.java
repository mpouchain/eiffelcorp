package fr.uge.ifshare.client;

import java.io.Serializable;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import fr.uge.ifshare.models.Product;
import fr.uge.ifshare.parser.ParseCommand;
import fr.uge.ifshare.service.IIfShareService;

public class IfShareClient implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private final IIfShareService ifShareService;
	private final ParseCommand parseCommand;
	private long bank;
	
	public IfShareClient() throws MalformedURLException, RemoteException, NotBoundException {
		this.ifShareService = (IIfShareService) Naming.lookup("rmi://localhost/IfShare");
		this.parseCommand = new ParseCommand();
		this.bank = 1_000;
	}
	
	public void notifyProductIsSell(Product product) {
		addToBank(product.getPrice());
		System.out.println("Vous avez vendu le produit suivant : " + product + "\nVotre solde s'élève maintenant à " + bank + "€");
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
}
