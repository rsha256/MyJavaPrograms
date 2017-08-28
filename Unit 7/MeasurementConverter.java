public class MeasurementConverter
{
    public static void main( String [] args)
    {
        String currentUnit = "";
        currentUnit = Input.getString( "Please enter the current unit." );
    //above we get user input for the current unit.

        String to = "";
        to = Input.getString( "Please enter the unit that you want to convert to." );
    //above we get user input for the unit that they want to convert to.


    double currentValue = 0;
    currentValue = Input.getDouble( "Please enter the current value." );
    //above we get user input for the current value.


    System.out.println( "You are converting from: " + currentUnit + "s to " + to + "s" );
    System.out.print( currentValue + " " + currentUnit + "s is: " );
    //above i made the program display what you are converting from and to (for user reference) along with the original value

    if ( currentUnit.equals("pound") && to.equals( "kilogram") ) {
        System.out.print( PoundToKilograms( currentValue ) );
        //if the person is trying to convert from pounds to kilograms we call the associated method  
    }
    else if ( currentUnit.equals("kilogram") && to.equals("pound") ) {
        System.out.print( KilogramsToPound( currentValue ) );
        //if the person is trying to convert from kilograms to pounds we call the associated method the current value by 1 divided by the associated constant
    }
    else if ( currentUnit.equals("ounce") && to.equals("gram") ) {
        System.out.print( OunceToGrams( currentValue ) );
        //if the person is trying to convert from ounces to grams we call the associated method
    }    
    else if ( currentUnit.equals("gram") && to.equals("ounce") ) {
        System.out.print( GramsToOunce( currentValue ) );
        //if the person is trying to convert from grams to ounces we call the associated method
    }
    else if ( currentUnit.equals("foot") && to.equals("meter") ) {
        System.out.print( FootToMeters( currentValue ) );
        //if the person is trying to convert from feet to meters we call the associated method
    }
    else if ( currentUnit.equals("meter") && to.equals("foot") ) {
        System.out.print( MetersToFoot( currentValue ) );
        //if the person is trying to convert from meters to feet we call the associated method
    }
    else if ( currentUnit.equals("mile") && to.equals("kilometer") ) {
        System.out.print( MileToKilometers( currentValue ) );
        //if the person is trying to convert from miles to kilometers we call the associated method
    }
    else if ( currentUnit.equals("kilometer") && to.equals("mile") ) {
        System.out.print( KilometersToMile( currentValue ) );
        //if the person is trying to convert from kilometers to miles we call the associated method
    }
    else { 
    System.out.print( "You have entered a units name wrong. Please try again! (no capital letters or the letter 's' at the end of the unit's word)" );
        //if its anything else then the user typed in something wrong so it'll display this message on how to type it properly
    }
            System.out.print(" " + to + "s");
            System.out.println();
            //above i print out the unit name so the output is for example '34 pounds' instead of 34
            //i also put a linefeed for clarity
    }
    
    public static double PoundToKilograms(double x) {
        final double POUNDTOKILOGRAMS = 0.4536;    
        //above is a conversion rates. I used final so that it cant be changed as it doesnt need to be since it is a constants.
        
        
        return( x * POUNDTOKILOGRAMS );
        //if the person is trying to convert from pounds to kilograms, we multiply the current value by the associated constan
    }
    
    public static double KilogramsToPound(double x) {
        final double POUNDTOKILOGRAMS = 0.4536;
        //above is a conversion rates. I used final so that it cant be changed as it doesnt need to be since it is a constants.
            
        return( x * (1/POUNDTOKILOGRAMS) );
        //if the person is trying to convert from kilograms to pounds, we multiply the current value by 1 divided by the associated constan
    }
    
    public static double OunceToGrams(double x) {
        final double OUNCETOGRAMS = 28.5;
        //above is a conversion rates. I used final so that it cant be changed as it doesnt need to be since it is a constants.
            
        return( x * OUNCETOGRAMS );
        //if the person is trying to convert from ounces to grams, we multiply the current value by the associated constant
    }
    
    public static double GramsToOunce(double x) {
        final double OUNCETOGRAMS = 28.5;
        //above is a conversion rates. I used final so that it cant be changed as it doesnt need to be since it is a constants.
        
        return( x * (1/OUNCETOGRAMS) );
        //if the person is trying to convert from grams to ounces, we multiply the current value by 1 divided by the associated constant
    }
    
    public static double FootToMeters(double x) {
        final double FOOTTOMETERS = 0.3048;
        //above is a conversion rates. I used final so that it cant be changed as it doesnt need to be since it is a constants.
        
        return( x * FOOTTOMETERS );
        //if the person is trying to convert from feet to meters, we multiply the current value by the associated constant
    }
    
    public static double MetersToFoot(double x) {
        final double FOOTTOMETERS = 0.3048;
        //above is a conversion rates. I used final so that it cant be changed as it doesnt need to be since it is a constants.
        
        return( x * (1/FOOTTOMETERS) );
        //if the person is trying to convert from meters to feet, we multiply the current value by the 1 divided byassociated constant
    }
    
    public static double MileToKilometers(double x) {
        final double MILETOKILOMETERS = 1.61;
        //above is a conversion rates. I used final so that it cant be changed as it doesnt need to be since it is a constants.
        
        return( x * MILETOKILOMETERS );
        //if the person is trying to convert from miles to kilometers we multiply the current value by the associated constants
    }

    public static double KilometersToMile(double x) {
        final double MILETOKILOMETERS = 1.61;
        //above is a conversion rates. I used final so that it cant be changed as it doesnt need to be since it is a constants.
        
        return( x * (1/MILETOKILOMETERS) );
        //if the person is trying to convert from kilometers to miles we multiply the current value by 1 divided by the associated constants
    }
}