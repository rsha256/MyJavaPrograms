import java.util.Scanner;

public class CostByWeight
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the weight!");
        int weight = input.nextInt();
        //above we get the user input and store it to an integer variable called weight

        if (0 < weight & weight <= 1)
            System.out.println("Cost = $3.50");

        else if (1 < weight & weight <= 3)
            System.out.println("Cost = $5.50");

        else if (3 < weight & weight <= 10)
            System.out.println("Cost = $9.50");

        else if (10 < weight & weight <= 20)
            System.out.println("Cost = 13.50");

        else
            System.out.println("the package is too heavy to be shipped");

        //above we have a if statement that tells you the cost based on the weight you inputted to the weight variable
    }
}