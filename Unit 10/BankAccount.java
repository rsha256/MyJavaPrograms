public class BankAccount
{
    public static void main( String [] args )
    {
        Account b1 = new Account("John Doe", 40.0);
        Account b2 = new Account("Jane Doe");   
        //above i make 2 objects. Since one of them does not have a double value, it'll be set to 0.0 (look at the account class)
        
        System.out.println(); //to the left i put a linefeed for neatness and clarity
        System.out.print( "b1  is " + b1.getName() + ". " + b1.getName() + " starts with a balance of $" + b1.getBalance() );
        System.out.println( "\t" + "b2  is " + b2.getName() + ". " + b2.getName() + " starts with a balance of $" + b2.getBalance() );
        //above i print the name and amounts for b1 and b2
        System.out.println(); //to the left i put a linefeed for neatness and clarity
        
        b1.withdraw(10.0);
        System.out.print( "b1  is " + b1.getName() + ". b1 has a balance of $" + b1.getBalance() );
        //above i use the withdraw method to withdraw the said amount from b1, which i then print with concatenating strings with methods for neatness and clarity
       
        b2.deposit(999999);
        System.out.println( "\t" + "                b2  is " + b2.getName() + ". b2 has a balance of $" + b2.getBalance() );
        //above i use the deposit method to deposit the said amount to b2, which i then print with concatenating strings with methods along with spaces for neatness and clarity
        
        b1.deposit(999999);
        System.out.print( "b1  is " + b1.getName() + ". b1 has a balance of $" + b1.getBalance() );
        //above i use the deposit method to deposit the said amount to b1, which i then print with concatenating strings with methods for neatness and clarity
        
        b2.withdraw(333.9);
        System.out.println( "\t" + "                b2  is " + b2.getName() + ". b2 has a balance of $" + b2.getBalance() );
        //above i use the withdraw method to withdraw the said amount from b2, which i then print with concatenating strings with methods along with spaces for neatness and clarity    
        
        b1.withdraw(1000028.3);
        System.out.print( "b1  is " + b1.getName() + ". b1 has a balance of $" + b1.getBalance() );
        //above i use the withdraw method to withdraw the said amount from b1, which i then print with concatenating strings with methods for neatness and clarity
        
        b2.deposit(999999);
        System.out.println( "\t" + "b2  is " + b2.getName() + ". b2 has a balance of $" + b2.getBalance() );
        //above i use the deposit method to deposit the said amount to b2, which i then print with concatenating strings with methods along with spaces for neatness and clarity
        
        b1.deposit(39.3);
        System.out.print( "b1  is " + b1.getName() + ". b1 has a balance of $" + b1.getBalance() );
        //above i use the deposit method to deposit the said amount to b1, which i then print with concatenating strings with methods for neatness and clarity         
        
        b2.withdraw(1999664.1);
        System.out.println( "\t" + "        b2  is " + b2.getName() + ". b2 has a balance of $" + b2.getBalance() );
        //above i use the withdraw method to withdraw the said amount from b2, which i then print with concatenating strings with methods along with spaces for neatness and clarity    
        
        System.out.println(); //to the left i put a linefeed for neatness and clarity
    }
}