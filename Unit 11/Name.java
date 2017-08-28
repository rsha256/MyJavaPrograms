public class Name 
{

    private String first;
    private String last;
    //above i make two Strings first and last that are private because only class members to 'Name' should be able to access these instance variables directly
    
    //below is a class constructor. i used 'this.'
    public Name(String first, String last) 
    {
        this.setFirst(first);
        this.setLast(last);
    }

    //below i use a getter method to return the first name
    public String getFirst() 
    {
        return first;
    }

    //below is a setter method for the first name
    public void setFirst(String first) 
    {
        this.first = first;
    }

    //below is a getter method for the last name
    public String getLast() 
    {
        return last;
    }

    //below is a setter method for the last name
    public void setLast(String last) 
    {
        this.last = last;
    }
    
    //below is a method i use to return the Name (first and last)
    public String toString() 
    {
        return this.first + " " + this.last;
    }
    
}