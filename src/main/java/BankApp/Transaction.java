package BankApp;

import java.time.LocalDateTime;

public class Transaction {
	
	static enum TransactionType {
		DEPOSIT,
		WITHDRAW
	}
	
	
	private float amount;
	private TransactionType type;
	private LocalDateTime date;
		
	public Transaction(TransactionType type, float amount) {
		this.amount = amount;
		this.type = type;
		this.date = LocalDateTime.now();
	}	
	
	public float getAmount() {
		return amount;
	}
	public TransactionType getType() {
		return type;
	}
	public LocalDateTime getDate() {
		return date;
	}	
}
