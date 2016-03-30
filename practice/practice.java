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
        int space = 8;
        int line = 9;
        int num = 9;
        for (int x = 0; x < line; x++)
        {
            for (int y = 0; y < space; y ++)
            {
                System.out.print("_");
            }
            space--;
            System.out.print(num);
            num--;
            System.out.println();
        }
    }
}