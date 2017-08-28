public class Assignment4
{
    public static void main ( String [] args )
    {
        final int MONDAY = 1;
        final int TUESDAY = 2;
        final int WEDNESDAY = 3;
        final int THURSDAY = 4;
        final int FRIDAY = 5;
        final int SATURDAY = 6;
        final int SUNDAY = 7;
        // above I define my constant integers, using final and capital letters to show that they are constants

        int day_of_week = 1;
        // above a integer variable called day_of_week is created with a value i randomly chose

        switch ( day_of_week )
        {
            case MONDAY:
                System.out.println("Today is Monday.");
                break;

            case TUESDAY:
                System.out.println("Today is Tuesday.");
                break;

            case WEDNESDAY:
                System.out.println("Today is Wednesday.");
                break;

            case THURSDAY:
                System.out.println("Today is Thursday");
                break;

            case FRIDAY:
                System.out.println("Today is Friday");
                break;

            case SATURDAY:
                System.out.println("Today is Saturday");
                break;

            case SUNDAY:
                System.out.println("Today is Sunday");
                break;

            default:
                System.out.println("Invalid Data.");
                break;
            // above is a switch construct that gives the day of the week based on what the integer variable day_of_week is set to. if it's set to a number not between 1-7 in will output 'invalid data'

        }
    }
}