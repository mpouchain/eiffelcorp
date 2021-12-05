package web.services;

import java.util.HashMap;

public class BankService {
	private final HashMap<Integer, Double> clients = new HashMap<>();
		
	public BankService() {
	}
	
	public boolean hasFunds(int id, double value) {
		return clients.get(id) >= value;
	}
	
	public void removeFunds(int id, double value) {
		if(clients.get(id) <= value) {
			System.out.println("Client " + id + " doesn't have enough money.");
		}
		clients.replace(id, clients.get(id));
	}
	
	public String description() {
		return "";
	}
}
