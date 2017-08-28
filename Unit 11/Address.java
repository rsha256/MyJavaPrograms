public class Address 
{
	private String street;
	private String city;
	private String state;
	private int zip;
	//above i make 3 Strings & 1 int for the address info. They are private because only class members to 'Address' should be able to access these instance variables directly
	
	//below is a class constructor
	public Address(String street, String city, String state, int zip) 
	{
		this.setStreet(street);
		this.setCity(city);
		this.setState(state);
		this.setZip(zip);
	}

	//below is a getter method for the street
	public String getStreet() 
	{
		return street;
	}

	//below is a setter method for the street
	public void setStreet(String street) 
	{
		this.street = street;
	}

	//below is a getter method for the city
	public String getCity() 
	{
		return city;
	}

	//below is a setter method for the city
	public void setCity(String city) 
	{
		this.city = city;
	}

	//below is a getter method for the state
	public String getState() 
	{
		return state;
	}

	//below is a setter method for the state
	public void setState(String state) 
	{
		this.state = state;
	}

	//below is a getter method for the zip code
	public int getZip() 
	{
		return zip;
	}

	//below is a setter method for the zip code
	public void setZip(int zip) 
	{
		this.zip = zip;
	}
		
	//below is a method I used to return the Address
	public String toString() 
	{
		return street + " " + city + " " + state + " " + zip;
	}

}