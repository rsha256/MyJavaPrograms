import java.util.Scanner;

public class LetterCounter
{
    public static void main(String [] args ) 
    { 
        int array[] = new int[26]; 
        //above i create a array to hold 26 integers

        for (int i = 0; i < array.length; i++)
        {
            array[i] = 0;
        }
        // above i use a for loop to add 1 to i until i is equal to the length of array
    
        Scanner Keyboard = new Scanner(System.in);
        // above I get user input stored into Keyboard

        String userInput;
        // above i declared the string userInput

        System.out.println("Please enter a string.");
        // above I prompt the user to enter input by displaying 'Please enter a string.'

        userInput = Keyboard.nextLine().toLowerCase();
        // above i use Keyboard.nextLine to get the program to register a string of words which is converted to lowercase and stored to the string userInput
    
        for (int i = 0; i < userInput.length(); i++)
        {
            char ch = userInput.charAt(i);
            // above i use the charAt method to store the character at location i in userInput to the char ch. the value of i changes each time the for loop goes around

            if (ch >= 'a' && ch <= 'z')
            {
                array[ch - 'a'] ++; 
                //above i use an if statement to determine if the character is a letter (we don't want spaces or numbers) and if it is, 1 is added to the array in the place corresponding to ch
            }
        }
    
        for (char ch = 'a'; ch <= 'z'; ++ch)
        {
            System.out.println("Letter " + ch + " count = " + array[ch-'a'] + " ");
            // above i print the output using concatenating strings for neatness
        }
    }
}