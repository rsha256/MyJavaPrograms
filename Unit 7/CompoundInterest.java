public class CompoundInterest {

   public static void main( String [] args )
   {
       double principal = 0;
       principal = Input.getDouble( "Enter the Principal amount: " );
      //above i get the dollars deposited at the beginning of a year
      
       double rate = 0;
      rate = Input.getDouble( "Enter the Rate: " );
      //above i get the annual interest rate. For example if the rate was 5% you would type in 5
      
       double time = 0;
      time = Input.getDouble( "Enter the Time (in years): " );
      //above i prompt the user to input the time that has passed
	double x = compound(principal, rate, time);
	System.out.println(x);
   }


   public static double compound(double principal, double rate, double time) {
  
      
            
      System.out.println( "" );
	//above I create a linefeed for neatness
      
      return( principal * Math.pow( (1 + rate/100), time ) );
      /* above we calculate the account after n years which is returned using the return keyword.
       * It is calculated by multiplying the principal amount by
       * ( 1 plus the rate (which we divided by 100 so that its a decimal now, and not a percent)
       * to the power of time )
       */       
    }

}
