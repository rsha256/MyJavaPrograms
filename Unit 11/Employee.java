public class Employee 
{
	private int number;
	private Name name;
	private Address address;
	private Date hireDate;
	//above i make 1 int and 3 object variables that are private because only class members to 'Employee' should be able to access these instance variables	directly
	
	public Employee(int number, Name name, Address address, Date date) 
	{
		this.setNumber(number);
		this.setName(name);
		this.setAddress(address);
		this.setHireDate(date);
	}
	//in the class constructor above, I referenced the corresponding object whose method is being invoked     

	//below i use a getter method to return the employee number
	public int getNumber() 
	{
		return number;
	}

	//below is a setter method for the employee number
	public void setNumber(int number) 
	{
		this.number = number;
	}

	//below is a getter method for the employee name
	public Name getName() 
	{
		return name;
	}

	//below is a setter method for the employee name
	public void setName(Name name) 
	{
		this.name = name;
	}

	//below i returned the address object with a method
	public Address getAddress() 
	{
		return address;
	}

	//below is a setter method for the address
	public void setAddress(Address address) 
	{
		this.address = address;
	}

	//below is a getter method for the HireDate
	public Date getHireDate() 
	{
		return hireDate;
	}

	//below is a setter method for the HireDate
	public void setHireDate(Date hireDate) 
	{
		this.hireDate = hireDate;
	}
	
	//below is a method i used to return the employee data
	public String toString() 
	{
		return "\n= Employee =\n" +
				"Number: " + number + "\n" + 
				"Name: " + name + "\n" + 
				"Address: " + address + "\n" + 
				"Hire Date: " + hireDate + "\n";
	}
}