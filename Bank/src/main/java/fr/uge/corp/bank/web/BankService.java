package fr.uge.corp.bank.web;

import java.util.HashMap;
import java.util.Map;

import fr.uge.corp.bank.common.BankClient;


public class BankService {
	private final HashMap<BankClient, Double> clients = new HashMap<>();
		
	public BankService() {
		clients.put(new BankClient(1), 40.0);
		clients.put(new BankClient(2), 400.0);
		clients.put(new BankClient(3), 200.0);
	}
	
	public void addClient(int id, double value) {
		BankClient bc = getClientById(id);
		clients.put(bc, value);
	}
	
	public double getFunds(BankClient bc) {
		return clients.get(bc);
	}
	
	public boolean hasFunds(int id, double value) {
		BankClient bc = getClientById(id);
		return clients.get(bc) >= value;
	}
	
	public void removeFunds(int id, double value) {
		BankClient bc = getClientById(id);
		if(clients.get(bc) < value) {
			System.out.println("Client " + id + " doesn't have enough money.");
		}
		clients.replace(bc, clients.get(getClientById(id)) - value);
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
	
	public BankClient getClientById(int id) {
		for(BankClient bc : clients.keySet()) {
			if(bc.getId() == id) {
				return bc;
			}
		}
		throw new IllegalArgumentException("Client " + id + " doesn't exist.");
	}
	
}
