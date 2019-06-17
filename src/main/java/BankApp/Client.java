package BankApp;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Client {

	private String firstName;
	private String lastName;
	private LocalDateTime dateOfBirth;
	private Address address;

	private ArrayList<Account> accountList;

	public Client(String firstName, String lastName, LocalDateTime dateOfBirth, Address address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.setAccountList(new ArrayList<>());
	}

//	public Client() {
//		this.firstName = "UNDEFINED";
//		this.lastName = "UNDEFINED";
//		this.dateOfBirth = LocalDateTime.now();
//		this.address = new Address();
//	}

	public Client() {
		this.firstName = "John";
		this.lastName = "Doe";
		this.dateOfBirth = LocalDateTime.now();
		this.address = new Address("Finding Nemo");
		this.setAccountList(new ArrayList<>());
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDateTime getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDateTime dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public ArrayList<Account> getAccountList() {
		return accountList;
	}

	public void setAccountList(ArrayList<Account> accountList) {
		this.accountList = accountList;
	}

}
