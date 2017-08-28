public class Date 
{
	private int month;
	private int day;
	private int year;
	// above i make 3 integer variables that are private because only class members to 'Date' should be able to access these instance variables
	
	// below is a class constructor
	public Date(int m, int d, int y) 
	{
		month = m;
		day = d;
		year = y;
	}

	// below is a setter method for the Date
	public void setDate(int m, int d, int y) 
	{
		month = m;
		day = d;
		year = y;
	}

    public int getMonth()
    {
        return month;
    }

    public int getDay()
    {
        return day;
    }

    public int getYear()
    {
        return year;
    }

    //below is a method i used to return the Date
	public String toString() 
	{
		return getMonth() + "/" + getDay() + "/" + getYear();
	}
}