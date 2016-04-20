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
        int counter1 = 1;
        int counter2 = 5;
        for (int a = 0; a < 10; a++)
        {
            if (a < 5)
            {
                for (int y = 0; y < counter1; y++)
                {
                    System.out.print(a);
                }
                counter1++;
            }
            else 
            {
                for (int z = counter2; z> 0; z-- )
                {
                    System.out.print(a);
                }
                counter2--;
            }
            System.out.println();
        }
    }
}