package web.services;

import java.util.HashMap;
import java.util.Map;

import web.models.BankClient;

public class BankService {
	private final HashMap<BankClient, Double> clients = new HashMap<>();
		
	public BankService() {
	}
	
	public void addClient(BankClient bc, double value) {
		clients.put(bc, value);
	}
	
	public double getFunds(BankClient bc) {
		return clients.get(bc);
	}
	
	public boolean hasFunds(BankClient bc, double value) {
		return clients.get(bc) >= value;
	}
	
	public void removeFunds(BankClient bc, double value) {
		if(clients.get(bc) < value) {
			System.out.println("Client " + bc + " doesn't have enough money.");
		}
		clients.replace(bc, clients.get(bc) - value);
	}
	
	public String description() {
		StringBuilder sb = new StringBuilder();
		sb.append("Bank : \n");
		for (Map.Entry<BankClient, Double> entry : clients.entrySet()) {
			BankClient key = entry.getKey();
		    double value = entry.getValue();
		    sb.append(key.description() + " a " + value + "€ dans son compte en banque.\n");
		}
		return sb.toString();
	}
	
}
