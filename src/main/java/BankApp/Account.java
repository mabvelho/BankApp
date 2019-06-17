package BankApp;

import java.util.List;

public class Account {

	private float balance;
	private List<Transaction> transactionList;

	private Account() {
		balance = 0;
		transactionList = null;
	}

	public boolean withdraw(float amount) {
		boolean isSuccessful = false;

		if ((amount >= 0) && (balance - amount >= 0)) {
			balance -= amount;

			Transaction transaction = new Transaction(Transaction.TransactionType.WITHDRAW, amount);
			transactionList.add(transaction);

			isSuccessful = true;
		}
		return isSuccessful;
	}

	public boolean deposit(float amount) {
		boolean isSuccessful = false;

		if (amount >= 0) {
			balance += amount;

			Transaction transaction = new Transaction(Transaction.TransactionType.DEPOSIT, amount);
			transactionList.add(transaction);

			isSuccessful = true;
		}

		return isSuccessful;
	}

	public float getBalance() {
		return balance;
	}
}
