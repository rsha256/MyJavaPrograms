public class SeriesOfIntegersSummationAssignment
{
    public static void main(String [] args)
    {
        int eventotal = 0;
        int oddtotal = 0;
        // Above I created two integer variables 'eventotal' and 'oddtotal' and initialized them to 0

        // Below is my for loop which does everything inside it 25 times
        for ( int z = 0; z <= 25; z++)
        {
            // if the current value of z is even
            if ( z % 2 == 0 )
            {
                // then eventotal is equal to eventotal plus z
                eventotal += z;
            }

            // if the current value of z isnt even, then its odd
            else
            {
                // so then oddtotal is equal to oddtotal plus z
                oddtotal += z;
            }
   
        }

     System.out.println( "The sum of the even integers is: " + eventotal );
     System.out.println( "The sum of the odd integers is: " + oddtotal );
     // Above I print out the sum of the even and odd integers
    }
}