package BankApp;

public class Address {
	private String street = "UNDEFINED";
	private String city = "UNDEFINED";
	private String state = "UNDEFINED";
	private String country = "UNDEFINED";
	private String zipCode = "UNDEFINED";
	private String number = "UNDEFINED";
	private String complement = "UNDEFINED";
	
	public Address(String street, String city, String state, String country, String zipCode, String number,
			String complement) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipCode = zipCode;
		this.number = number;
		this.complement = complement;
	}
	
	public Address() {
		
	}
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getComplement() {
		return complement;
	}
	public void setComplement(String complement) {
		this.complement = complement;
	}
		
}
