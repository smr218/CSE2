/*
Stephan Reyes
This program will have two methods that both return void and have the same 
name.  The only difference is that one method will accept and int and the 
other will accept a string. The method that accepts an int will print out a 
square of % characters with length and width of the number that provided as 
input. The method that accepts a string will print the string out the same 
number of times as there are characters in the string.
*/
import java.util.Scanner;// imports Scanner in order to have users input values
public class Rectangularize//main method required for every Java Program 
{
    public static void main (String[]args)// MAIN METHOD
    {
        while(true)// loops until break statement 
        {
            Scanner input = new Scanner(System.in);//declares an instance of the Scanner object and constructs it
            System.out.println("Either enter a word or an integer");// print statement
            boolean checkInteger = input.hasNextInt();// checks to see if an integer was input
            if (checkInteger)// if an integer was input continues
            {
                int integer = input.nextInt();// makes the input into an integer
                Rectangle(integer);// calls the Rectangle method that uses an integer
                break;// breaks out of infinte loop
            }
            boolean checkWord = input.hasNext();// checks to see if the input was a word
            if (checkWord)// if a word was typed in continues
            {
                String word = input.next();// converts the input into a String
                Rectangle(word);// calls the Rectangle method that uses a String
                break;//breaks out of infinite loop
            }
        }
    }
    public static void Rectangle(String x)// Rectangle method that runs if the input was a String
    {
        System.out.println("output:");// print statement 
        for (int i = 0; i < x.length(); i++)// as long as int i is less than the length of the word input, continuously prints the word on a new line
        {
            System.out.println(x);// prints word on new line
        }
    }
    public static void Rectangle(int x)// Recatangle method that runs if the input was an integer
    {
        for (int i = 0; i < x; i++)// as long as int i is less than the number prints a new line
        {
            for (int j = 0; j < x; j++)// as long as int j is less than the input pronts a % the inputed number amount of times
            {
                System.out.print("%");// prints %
            }
            System.out.println();// prints a new line
        }
    }
}