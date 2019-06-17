package BankApp;

public class Address {

	private String street;
	private String city;
	private String state;
	private String country;
	private String zipCode;
	private String number;
	private String complement;

	public Address(String street, String city, String state, String country, String zipCode, String number,
			String complement) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipCode = zipCode;
		this.number = number;
		this.complement = complement;
	}

	public Address() {
		this.street = "UNDEFINED";
		this.city = "UNDEFINED";
		this.state = "UNDEFINED";
		this.country = "UNDEFINED";
		this.zipCode = "UNDEFINED";
		this.number = "UNDEFINED";
		this.complement = "UNDEFINED";
	}
	
	public Address(String reference) {		
		if (reference == "Finding Nemo") {
			this.street = "Wallaby Way";
			this.city = "Sydney";
			this.state = "New South Wales";
			this.country = "Australia";
			this.zipCode = "12345-678";
			this.number = "42";
			this.complement = "";
		} else {
			this.street = "UNDEFINED";
			this.city = "UNDEFINED";
			this.state = "UNDEFINED";
			this.country = "UNDEFINED";
			this.zipCode = "UNDEFINED";
			this.number = "UNDEFINED";
			this.complement = "UNDEFINED";
		}
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
