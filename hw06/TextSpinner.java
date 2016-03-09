/*
Stephan Reyes
In old school unix programs, a “spinner” is used to indicate progress, not unlike the your browser now.  
In TextSpinner.java, write an infinite loop that recreates this effect:
First it looks like this: /
then it looks like this: -
then it looks like this: \
then it looks like this: |
then it looks like this, retuning to the original display: /
Each time it is printed, java prints a backspace (“\b”) to eliminate the previous character and display the next one.
*/
import java.util.Scanner;// imports Scanner in order to have users input values
public class TextSpinner//main method required for every Java Program 
{
    public static void main (String[]args)
    {
        String x = "TOO EASY";//String x statement to make the loop infinite set equal to the statement "TOO EASY"
        while (x.equals("TOO EASY"))//checks to see if string x is equal to the string statement "TOO EASY" and continuosly loops since x is never changed within the while loop
        {
            System.out.print("\b/");//deletes any previous statement and prints /
            System.out.print("\b-");//deletes any previous statement and prints -
            System.out.print("\b\\");//deletes any previous statement and prints \
            System.out.print("\b|");//deletes any previous statement and prints |
            
            //SPINS AND SPINS AND SPINS AND SPINS AND SPINS AND SPINS AND SPINS AND SPINS AND SPINS AND SPINS AND SPINS AND SPINS AND SPINS ... YOU GET THE IDEA
        }
    }
}