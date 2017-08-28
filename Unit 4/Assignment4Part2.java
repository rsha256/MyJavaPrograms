public class Assignment4Part2
{
    public static void main ( String [] args )
    {
        int test_score_1 = 90;
        int test_score_2 = 85;
        int test_score_3 = 75;
        //above you input your test scores

        double average = ((test_score_1 + test_score_2 + test_score_3)/3.0);
        // above your average is calculated and stored to a double-precision variable by the name of 'average'

        char letterGrade;
        // we create a char variable above to store the letter grade

        System.out.println( "\n" + "Your average test score is: " + average );
        // above we print out your average score after a line break (for clarity)

        if((average >= 90 ) && (average <= 100))
            letterGrade='A';

        else if((average >= 80 ) && (average < 90))
            letterGrade='B';

        else if((average >= 70 ) && (average < 80))
            letterGrade='C';

        else if((average >= 65 ) && (average < 70))
            letterGrade='D';

        else
            letterGrade='F';
        // above the letter grade is calculated from your average test score

        System.out.println( "Your letter grade is: " + letterGrade );
        // above your letter grade is printed out
    }
}