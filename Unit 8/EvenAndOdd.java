public class EvenAndOdd
{
    public static void main(String [] args)
    {
    int [] randomNums = new int [100];
    //above i create an array to hold 100 integers
    
    for (int i = 0; i < randomNums.length; i++) { 
        randomNums[i] = (int) (Math.random() * 26); 
    }
    //above i randomly give a integer value to each of the 100 integers
        
    int[] oddNums = sortOdd(randomNums);
    //above i invoke the method sortOdd to get the odd numbers
    
	System.out.println();
        System.out.println("The odd numbers are: "); 

        for (int n = 0; n<oddNums.length; n++) { 
        System.out.print(oddNums[n] + "  " ); 
        //above i print the odd numbers
    }
        int[] evenNums = sortEven(randomNums);
        //above i invoke the method sortEven to get the even numbers
        
        System.out.println();
        System.out.println("The even numbers are: ");
        
    for (int o = 0; o<evenNums.length; o++) { 
        System.out.print(evenNums[o] + "  ");
        //above i print the even numbers
    } 
}

public static int[] sortOdd(int[] randomNums)
    {
        int numOdds = 0;
        for (int x : randomNums){
            if(x % 2 == 1){
            ++numOdds;
            }
        }
        //above i determine if the integer is odd or even using the modulus operator & if its odd then 1 is added to numOdds
        
        int[] oddNums = new int[numOdds]; 
        //above i create an array to hold the odd integers
        
        int z = 0;
        for (int n : randomNums){
            if(n % 2 == 1){
                oddNums[z] = n;
                z++;
            }
        }
        //above i store the numbers to the array oddNums
    
        return oddNums;


    } 
    
public static int[] sortEven(int[] randomNums)
    {
        int numEvens = 0;
        for (int x : randomNums){
            if(x % 2 == 0){
            ++numEvens;
            }
        }
        //above i determine if the integer is odd or even using the modulus operator & if its even then 1 is added to numEvens
        
        int[] evenNums = new int[numEvens];
        //above i create an array to hold the even integers
        
        int z = 0;
        for (int n : randomNums){
            if(n % 2 == 0){
                evenNums[z] = n;
                z++;
            }
        }
        //above i store the numbers to the array evenNums

        System.out.println();

        return evenNums;

    }
}