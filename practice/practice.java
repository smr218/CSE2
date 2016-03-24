/*
Write a program that asks the user for two integers: Length and Width.  
Length is to specify how many characters the following pattern should spread, 
horizontally, across the screen.  Width should specify how many characters the 
following pattern should spread, vertically, across the screen. 
*/
import java.util.Scanner;// imports Scanner in order to have users input values
public class practice//main method required for every Java Program 
{
    public static void main (String[]args)
    {
        while (true)
        {
            Scanner input = new Scanner(System.in);// declares an instance of the Scanner object and constructs it
            System.out.print("Input your desired length: ");
            boolean checkl = input.hasNextInt();
            if (checkl)
            {
                int length = input.nextInt();
                while (length <= 0 || length >= 80)
                {
                    System.out.println("Enter and length between 1 and 80");
                    length = input.nextInt();
                }
                    System.out.print("Input your desired width: ");
                    boolean checkw = input.hasNextInt();
                    if (checkw)
                    {
                        int width = input.nextInt();
                        while (width > length || width <= 0)
                        {
                            System.out.println("Enter and width less than the length and greater than 0");
                            width = input.nextInt();
                        }
                        for (int l = length; l > 0; l--)
                        {
                            System.out.println("x");
                        }
                        for (int w = width ; w > 0; w--)
                        {
                            System.out.println("y");
                        }
                    break;
                    }
                    else 
                    {
                        System.out.println("Error: You didn't enter an integer");
                        input.next();
                    }
            }
            else
            {
                System.out.println("Error: You didn't enter an integer");
                input.next();
            }
        }
    }
}