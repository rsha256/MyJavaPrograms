public class NestedLoopsAssignmenttwo
{
    public static void main(String[] args) 
    {
        // Below I initialize an integer variable n to 1
        int n = 1;

        // Below i make a for loop which starts at 10 and goes down 1 turn until it reaches 1
        for ( int i = 10; i >= n; i-- )
        {
            // Below is the for loop which displays an asterisk 'i' times
            for ( int j = 1; j <= i; j++ )
            {
                System.out.print( "*" );
            }
            // Below I print out a linefeed for neatness
            System.out.println();
        }
    }
}