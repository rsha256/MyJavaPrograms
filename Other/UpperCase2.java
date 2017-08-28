public class UpperCase2
{
	public static void main( String [] args )
	{
		String [] s = { "Where's the Beef?", "Rock My World" };

		System.out.println();

		toUpper( s );
	}

	public static void toUpper( String [] str )
	{
		System.out.println();

		for ( int j = 0; j < str.length; j++ )
			display( str[j].toUpperCase () );
	}

	public static void display( String str )
	{
		System.out.println(str);
	}
}