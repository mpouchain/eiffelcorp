package models;

public class BankClient {
	private final int id;
	private double balance;
	
	public BankClient(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void addToBank(double value) {
		balance+=value;
	}
	
	public boolean removeFromBank(double value) {
		if(balance >= value) {
			balance-=value;
			return true;
		}
		return false;		
	}
}
