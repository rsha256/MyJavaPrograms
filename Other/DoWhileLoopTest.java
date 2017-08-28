public class DoWhileLoopTest
{
    public static void main(String [] args)
{
    int x = 1;
    int z = 0;
    
    System.out.println( );
    do
    {
    z += x;
    x++;
    } while ( x <= 5 );

     System.out.println( "sum of 1 to 5 = " + z );
}
}