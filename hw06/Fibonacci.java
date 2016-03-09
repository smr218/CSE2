/*
Stephan Reyes
The Fibonacci numbers begin with two numbers, a1 and a2, and any subsequent number is the sum of the last two.  
Thus, ai = ai-1 + ai-2.  In this program, first ask the user for three positive integers 
(if an invalid value is entered, then ask again, using a while loop).  
Let the first two positive integers be a1 and a2, and let the third be the n, number of Fibonacci numbers to print out.
Print out the user’s input, then print out the first n Fibonacci numbers.  
Print a comma after each number, except the last one, where you should print a period.  
*/
import java.util.Scanner;// imports Scanner in order to have users input values
public class Fibonacci//main method required for every Java Program 
{
    public static void main (String[]args)
    {
        int a = 0;// inital value for a
        int count = 0;//value that will be incremented at the end of the code
        String sequence = "";// makes a string statement for the fibonacci sequence
        while (count == 0)// as long as count is 0 the computer will continue to do the code within over and over
        {
            Scanner input = new Scanner(System.in);// declares an instance of the Scanner object and constructs it
            System.out.print("Enter the first number in the sequence: ");// tells the user to input a number for the first number in the sequence
            boolean first = input.hasNextInt();// checks to see if the first number is an integer 
            if (first)// if it is an integer then the code continues else resets everything and makes the user input three new integers(back to first) 
            {
                int a1 = input.nextInt();// since first was an int, the inputed number is saved as an int
                if (a1 > 0)// checks to see if the int a2 is a positive integer resets everything and makes the user input three new integers(back to first) 
                {
                    System.out.print("Enter the second number in the sequence: ");// tells the user to input a number for the second number in the sequence
                    boolean second = input.hasNextInt();// checks to see if the second number is an integer 
                    if (second)// if it is an integer then the code continues else resets everything and makes the user input three new integers(back to first) 
                    {
                        int a2 = input.nextInt();// since second was an int, the inputed number is saved as an int
                        if (a2 > 0)// checks to see if the int a2 is a positive integer resets everything and makes the user input three new integers(back to first) 
                        { 
                            System.out.print("Enter how long you want the sequence to be: ");// tells the user to input a number for the third number in the sequence
                            boolean third = input.hasNextInt();// checks to see if the third number is an integer 
                            if (third)// if it is an integer then the code continues else resets everything and makes the user input three new integers(back to first) 
                            {
                                int n = input.nextInt();// since third was an int, the inputed number is saved as an int
                                if (n > 0)// checks to see if the int n is a positive integer resets everything and makes the user input three new integers(back to first) 
                                {
                                    sequence = (a1 + ", " + a2 + ", ");// adds the first 2 values in the sequence to the fibonacci sequence
                                    count++;// increments count since all inputs are correct and the code no longer needs to be repeated
                                    while (n > 3)//as long as the n value is greater than 2 (fibonacci sequence minus the first two numbers) continues to do fibonacci code
                                    {
                                        a = a1 + a2;// is the following value after the previous two numbers are added up
                                        sequence = (sequence + a + ", ");//adds the number to the string of fibonacci numbers and a "," after
                                        a1 = a2;//replaces the a1 with a2
                                        a2 = a;//replaces a2 with a
                                        n--;//decrements n by 1 to break out of the while loop once it equals 2
                                        if (n == 3)//if n is equal to 2 then the fibonacci code is repeated for the last integer in the sequence 
                                        {// however there is no "," after the number
                                            a = a1 + a2;// is the following value after the previous two numbers are added up
                                            sequence = (sequence + a);//adds the number to the string of fibonacci numbers
                                            a1 = a2;//replaces the a1 with a2
                                            a2 = a;//replaces a2 with a
                                        }
                                    }
                                    System.out.println("\nThe numbers are:\n" + sequence + ".");// prints out the sequence
                                }
                                else
                                {
                                    System.out.println("\nYou did not enter a positive integer for the third integer");//tells they didn't enter a positive int in third integer 
                                }
                            }
                            else 
                            {
                                System.out.println("\nYou did not enter an integer for the third integer");//tells the user they didn't enter an int in third integer
                                input.next(); //Loops back to first
                            }
                        }
                        else 
                        {
                            System.out.println("\nYou did not enter a positive integer for the second integer");//tells they didn't enter a positive int in second integer 
                        }
                    }
                    else
                    {
                        System.out.println("\nYou did not enter an integer for the second integer");//tells the user they didn't enter an int in second integer
                        input.next(); //Loops back to first
                    }
                }
                else 
                {
                    System.out.println("\nYou did not enter a positive integer for the first integer");//tells they didn't enter a positive int in first integer 
                }
            }
            else
            {
                System.out.println("\nYou did not enter an integer for the first integer");//tells the user they didn't enter an int in first integer
                input.next();//Loops back to first
            }
            
        }
    }
}