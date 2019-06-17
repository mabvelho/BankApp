package BankApp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import BankApp.Transaction.TransactionType;

public class Account {

	private long balance;
	private ArrayList<Transaction> transactionList;

	public Account() {
		balance = 0;
		transactionList = new ArrayList<Transaction>();
	}

	public boolean withdraw(double amount) {
		boolean isSuccessful = false;

		if ((amount > 0) && (balance - amount >= 0)) {
			balance -= amount;

			Transaction transaction = new Transaction(Transaction.TransactionType.WITHDRAW, amount);
			transactionList.add(transaction);

			isSuccessful = true;
		}
		return isSuccessful;
	}

	public boolean deposit(double amount) {
		boolean isSuccessful = false;

		if (amount >= 0) {
			balance += amount;

			Transaction transaction = new Transaction(Transaction.TransactionType.DEPOSIT, amount);
			transactionList.add(transaction);

			isSuccessful = true;
			
			
		}

		return isSuccessful;
	}

	public String statement() {
		
		StringBuilder statement = new StringBuilder();
		
		if (transactionList.size() > 0) {
			
			String statementTitle = "Bank statement:\n";
					
			statement.append(statementTitle);
			
			System.out.println(statementTitle);
			
			transactionList.forEach(
					(transaction) -> {
						LocalDateTime transactionDate = transaction.getDate();						
						TransactionType transactionType = transaction.getType();
						String currentStatement;
						
						
						switch(transactionType) {
						case DEPOSIT:
							currentStatement = String.format(
									"\tType: Deposit; Date and Time: %s; Amount: %f\n", 
									transactionDate.toString(), 
									transaction.getAmount()
									);
							
							statement.append(currentStatement);
							
							System.out.print(currentStatement);
							
							break;
						case WITHDRAW:
							currentStatement = String.format(
									"\tType: Withdraw; Date and Time: %s; Amount: %f\n", 
									transactionDate.toString(), 
									transaction.getAmount()
									);
							
							statement.append(currentStatement);
							
							System.out.print(currentStatement);
							
							break;							
						}
					});
		} else {
			String emptyMessage = "No transactions available for a bank statement.";
			
			statement.append(emptyMessage);
			
			System.out.println(emptyMessage);
		}
		
		return statement.toString();
		
	}
	
	public void close() {
		balance = 0;
		transactionList.clear();
	}
	
	public double getBalance() {
		return balance;
	}
}
