public class InheritanceDemo
{
	public static void main( String [] args )
	{
		EvenBetterCube aCube = new EvenBetterCube();

		aCube.setSide( 5 );

		System.out.println( "\n" + "area= " + aCube.getSideArea() );
		System.out.println( "surf area= " + aCube.getSurfaceArea() );
		System.out.println( "vol= " + aCube.getVolume() );
	}
}