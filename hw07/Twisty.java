/*
Stephan Reyes
Write a program that asks the user for two integers: Length and Width.  
Length is to specify how many characters the following pattern should spread, 
horizontally, across the screen.  Width should specify how many characters the 
following pattern should spread, vertically, across the screen. 
*/
import java.util.Scanner;// imports Scanner in order to have users input values
public class Twisty//main method required for every Java Program 
{
    public static void main (String[]args)
    {
        while (true)// loops code forever until break statement
        {
            Scanner input = new Scanner(System.in);// declares an instance of the Scanner object and constructs it
            System.out.print("Input your desired length: ");// makes the user input a length
            boolean checkl = input.hasNextInt();// checks to see if length is an integer
            if (checkl)// if it is continues else start process all over
            {
                int length = input.nextInt();// converts first input into an int
                while (length <= 0 || length >= 80)// makes sure the input is within the range of 1 to 80 if not tells user to input one
                {
                    System.out.println("Enter and length between 1 and 80");
                    length = input.nextInt();
                }
                    System.out.print("Input your desired width: ");// tells user to input a width
                    boolean checkw = input.hasNextInt();// checks to see if the input is an integer
                    if (checkw)// if it is continues else start process all over
                    {
                        int width = input.nextInt();// converts second input into an int
                        while (width > length || width <= 0)// makes sure the width is greater than 0 and less than the length
                        {
                            System.out.println("Enter and width less than the length and greater than 0");// if it isn't tells the user to input a number within that range
                            width = input.nextInt();
                        }
                        int i= ((width*2) - 1);// int for one less than two times the width
                        int counter1 = (width - 1);// int for one less one times the width
                        int counter = 0;// int a counter starting at 0
                        String pound = ("#");// prints "#"" when called on
                        String fslash = ("/");// prints "/" when called on
                        String bslash = ("\\");// prints "\" when called on
                        for (int x = 0; x < width; x++)// mediates what row the printed objects will be on
                        {
                            int a = 2;// int equal to 2
                            int b = 3;// int equal to 3
                            int c = 1;// int equal to 1
                            int d = (width -1);// int equal to 1 less than the width (can reset)
                            int e = (width *2);// int equal to two times the width
                            int f = 1;// int equal to 1
                            for (int y = 0; y < length; y++)// mediates what number space is being modifiedd within the row 
                            {
                                while (y == (x+(a*width)))// prints # down and to the right
                                {
                                    System.out.print(pound);
                                    a= a + 2;
                                }
                                while (y == (x+(b*width)))// prints back slashes down and to the right
                                {
                                    System.out.print(bslash);
                                    b= b + 2;
                                }
                                while ( y == (e*c) + d - x)// prints forwards slashes up and to the right
                                {
                                    System.out.print(fslash);
                                    c++;
                                }
                                while (y == (e*f) - 1 - x)// prints # up and to the right
                                {
                                    System.out.print(pound);
                                    f++;
                                }
                                if (y == counter1 - x )// prints first set up and to the right forward slashes
                                {
                                    System.out.print(fslash);
                                }
                                if (x == y )// prints first set of down and to the right #
                                {
                                    System.out.print(pound);
                                }
                                else if ( (y-x) == (i - counter1) )// prints first set of down and to the right back slashes
                                {
                                    System.out.print(bslash);
                                }
                                else// if nothing above is met, prints a space
                                {
                                    System.out.print(" ");
                                }
                            }
                            System.out.println();// prints a new line to get to next row
                        }
                    break;// breaks out of the infinte loop
                    }
                    else // starts process all over
                    {
                        System.out.println("Error: You didn't enter an integer");
                        input.next();
                    }
            }
            else// starts process all over
            {
                System.out.println("Error: You didn't enter an integer");
                input.next();
            }
        }
    }
}