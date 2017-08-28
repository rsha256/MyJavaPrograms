public class BetterRobot extends Robot
{
    String modelNumber;
    
    public BetterRobot( String nm, String x )
    {
        super( nm );
        modelNumber = x;
    }
    
    public void display()
    {
        super.display();
        System.out.println( "My model number is " + modelNumber );
    }
}
