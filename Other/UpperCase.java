public class UpperCase
{
	public static void main( String [] args )
	{
		String [] s = new String [ args.length ];

		for ( int j =0; j < args.length; j++ )
			s[ j ] = args[ j ];
		display( s );
	}

	public static void display( String [] str )
	{
		System.out.println();

		for ( int j = 0; j < str.length; j++ )
			System.out.print( str[ j ].toUpperCase() );
		System.out.println();
	}
}