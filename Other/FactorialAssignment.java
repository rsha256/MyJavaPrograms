import java.util.Scanner;
public class FactorialAssignment
{
	public static void main( String [] args )
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number: ");
		
		int z = input.nextInt();
		int factorial = 0;
		System.out.println();
	
		for ( int n = 1; n <= 5; n++ )
		{
			factorial = n;
			for ( int j = n-1; j >= 1; j-- )
			{
				factorial = factorial * j;
			}
			
			System.out.println( "n = " + n + "\t n! = " + factorial );
		}
	}
}