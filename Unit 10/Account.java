public class Account
{
    private String name;
    private double balance;
    // above i declared my variables. I used private because only class members should have direct access to it. I used double for precision

    public Account( String n )
    {
        setName( n );
    }
    // above i made a class constructor, so if a user inputs only a String, then the balance will be set to 0.0

    public Account( String n, double b )
    {
        setName( n );
        setBalance( b );
    }
    // however if a user has a current balance than that will work as well, thanks to the class constructor above

    public void withdraw( double amount )
    {
        if (amount > 0.0 && amount <= balance)
        {
            balance = balance - amount;
        }
        else
        {
            error_msg();
        }
    }
    // above i created a method called withdraw that allows you withdraw an amount of money, if you have that much in your account currently

    public void deposit( double amount )
    {
        if (amount > 0.0)
        {
            balance = balance + amount;
        }
    }
    // i didn't put a error message because what the user did wrong is obvious as you cant deposit a negative value;

    public void setName( String name )
    {
        this.name = name;
    }
    // Above is my setter method for the name

    public void setBalance( double balance )
    {
        this.balance = balance;
    }
    // Above is my setter method for the balance

    public String getName()
    {
        return name;
    }
    // above i made a getter (or accessor) method to display the name when the method is invoked

    public double getBalance()
    {
        return balance;
    }
    // above i made a getter (or accessor) method to display the balance when the method is invoked

    private void error_msg()
    {
        System.out.println( "You are trying to withdraw more than you currently have!" );
    }
    // above i made a method called error_msg that displays a error message if invoked. It is private because a user does not need to invoke it directly
}