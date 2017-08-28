import java.util.Scanner;

public class Project1
{
    public static void main(String[] args) 
    {

         char [] English = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', ' ' };
         //above i create an array called English to store the english letters and numbers 
         
            String [] Morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-",  ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----", "|" }; 
            //above I created an array of Strings called Morse which stores the letters and numbers in morse 
            
            Scanner input = new Scanner (System.in);
            //above i create a Scanner object named input, which i use throughout the program for user input
            
            System.out.println( "Please enter \"Morse Code\" if you want to translate Morse Code into English, or \"English\" if you want to translate from English into Morse Code" );
            String a = input.nextLine();
            //above i get the user to type in 'Morse Code' or 'English' by prompting them with a message. The input is then stored to the String a
            
         if ( a.equalsIgnoreCase("Morse Code"))
         {
                    //if the user inputted Morse Code then that indicates that they have a Morse Code statement they want translated to English, so below i prompt the user to enter the sentence they want translated
                    System.out.println( "Please enter a sentence in Morse Code. Separate each letter/digit with a single space and delimit multiple words with a | ." );
                    String d = input.nextLine();
                    //above i store the user input to the String 'd', using nextLine to understand multiple words
                    String[] statements = null;
                    //above i created an array of String called statement which is set to null
                    
                    if(d.contains("|"))
                    {
                     statements = d.split("[|]");
                     //above i detect if there are multiple words. Since this if statement is nested in the 'Morse Code' if statement, that means than the user inputted Morse Code and i told the user to delimit multiple words with a '|', so if d contains a '|' that means there are multiple words and I will have to split it to multiple Strings    
                    }
                    
                    else
                    {
                        statements = new String[1];
                        statements[0] = d;
                        //if the Morse Code statement doesn't contain any '|' then that that means there is only 1 word, so i can make the 1st string in the array equal to the user input directly, without having to split it
                    }
                    for (String statement: statements )
                    {
                        String[] characters = statement.split(" ");
                        for(int j = 0; j < characters.length; j++)
                        {
                        for(int i = 0; i < Morse.length; i++)
                        {
                            if(characters[j].equals(Morse[i]))
                            {
                                System.out.print(English[i]);
                                //above I print the english translation by printing out the corresponding String in english from the String in Morse Code which is the same as the inputted String from String 'a' 
                            }
                        }
                        }
                        System.out.print(" ");
                        //above i print spaces for in between words
                    }    
         }
         else if ( a.contains( "English" ))
         {
                    //if the user inputted English then that indicates that they have a English statement they want translated to Morse Code, so below i prompt the user to enter the sentence they want translated
                    System.out.println("Please enter a sentence in English, and separate each word with a blank space.");
                    String c = input.nextLine(); 
                    //above i store the user input to the String 'c', using nextLine to understand multiple words
                    
                    c = c.toLowerCase();
                    //since we are in english now and are translating to Morse Code, we need to make all letters lower case so the program will read it as english, and thats done using the .toLowerCase method
                    
                    for ( int x = 0; x < c.length(); x++ )
                    {
                        for ( int y = 0; y < English.length; y++ )
                        {
                            if ( English [ y ] == c.charAt ( x ) )

                            System.out.print ( Morse [ y ] + " " );
                            //above I print the morse code translation by printing out the corresponding char in Morse from the char in English which is the same as the inputted letter from String 'c' 
                        }
                    }
         }
         else 
         {
                    System.out.println ( "Invalid Input. Please make sure to type 'Morse Code' or 'English'" );
                    //if they didn't type 'Morse Code' or 'English', I tell the user what they did wrong so they know how to use the program
         }
    }
}