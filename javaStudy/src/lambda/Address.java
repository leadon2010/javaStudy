package lambda;

public class Address {
	private String country;
	private String city;

	public Address(String country, String city) {
		super();
		this.country = country;
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public String getCity() {
		return city;
	}

	@Override
	public String toString() {
		return "Address [country=" + country + ", city=" + city + "]";
	}

}