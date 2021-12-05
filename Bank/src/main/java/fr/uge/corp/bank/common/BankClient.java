package fr.uge.corp.bank.common;

import java.util.ArrayList;
import java.util.List;

import fr.uge.corp.bank.common.Product;

public class BankClient {
	private int id;
	
	
	public BankClient() {}
	
	public BankClient(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public String description() {
		return "Client " + id;
	}
	
	@Override
	public boolean equals(Object obj) {
		return obj instanceof BankClient
				&& ((BankClient)obj).getId() == id;
	}
	
	@Override
	public int hashCode() {
		return Integer.valueOf(id).hashCode();
	}
}