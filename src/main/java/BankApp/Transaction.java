package BankApp;

import java.time.LocalDateTime;

public class Transaction {
	
	static enum TransactionType {
		DEPOSIT,
		WITHDRAW
	}	
	
	private double amount;
	private TransactionType type;
	private LocalDateTime date;
		
	public Transaction(TransactionType type, double amount) {
		this.amount = amount;
		this.type = type;
		this.date = LocalDateTime.now();
	}	
	
	public double getAmount() {
		return amount;
	}
	public TransactionType getType() {
		return type;
	}
	public LocalDateTime getDate() {
		return date;
	}	
}
