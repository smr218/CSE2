/*
Stephan Reyes
You are taking a math test; unfortunately, you forgot to bring your TI-84 calculator. 
So you decide to write yourself a calculator program using a while-loop. 
Your task: use while-loop to solve factorial programs. Using scanner, 
you will first input an integer that is between 9 and 16 inclusively. 
Then you need to calculate the factorial of the input number.  
*/
import java.util.Scanner;// imports Scanner in order to have users input values
public class RunFactorial//main method required for every Java Program 
{
    public static void main (String[]args)
    {
        int count = 0;//value that will be incremented at the end of the code
        while (count == 0)// as long as count is 0 the computer will continue to do the code within over and over
        {
            int countdown = 0;// value that will go down to 1 and times the given by this each time
            int numberfac = 0;//set value to later store original input
            Scanner input = new Scanner(System.in);// declares an instance of the Scanner object and constructs it
            System.out.print("Please enter an integer that is between 9 and 16: ");//tells the user to input a number between 9 and 16 (inclusive)
            boolean check = input.hasNextInt();//checks to see if the value is an integer
            if (check)// if it is, continues with code else make the user enter an actual integer
            {
                int number = input.nextInt();//turns the user's input into a int
                countdown = (number - 1);// is the value the orginal number will be multiplied by
                numberfac = number;// saves the original input
                if (number >=9 && number <= 16)//checks to see if that value is between 9 and 16 (inclusive) else tells the user to input a int in the range
                {
                    count++;//increments count since the code no longer needs to loop and no more user inputs are required
                    while (countdown > 0)// as long as countdown is greater than 0 the number will be multiplied by itself times countdown-1
                    {
                        number = number * countdown;// new number for factorial 
                        countdown--;//decrements countdown
                    }
                    System.out.println("Input accpeted:\n" + numberfac+ "!= " +number);// prints what the original numbers factorial will be
                }
                else 
                {
                    System.out.println("Please enter a valid integer between 9 and 16 (inclusive)");//tells the user that they didn't enter an int between 9 and 16 inclusive
                }
            }
            else 
            {
                System.out.println("Please enter a valid INTEGER");//tell the user to input an integer
                input.next();// loops back to original question
            }
        }
    }
}