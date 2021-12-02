package services;

import java.util.ArrayList;
import java.util.List;

import models.BankClient;

public class BankService {
	private final List<BankClient> clients;
	
	public BankService() {
		this.clients = new ArrayList<>();
	}
	
	public boolean hasFunds(int id, double value) {
		return clients.get(id).getBalance() >= value;
	}
	
	public void debit(int id, double value) {
		if(!clients.get(id).removeFromBank(value)) {
			System.out.println("Client " + id + " doesn't have enough money.");
		}
	}

}
