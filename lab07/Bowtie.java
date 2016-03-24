/*

*/

import java.util.Scanner;// imports Scanner in order to have users input values
public class Bowtie//main method required for every Java Program 
{
    public static void main (String[]args)
    {
        Scanner input = new Scanner(System.in);// declares an instance of the Scanner object and constructs it
        int nStars = 9;

        for (int line = 1; line <= 9; line++)
        {
            for (int space = 0; space > line; space++)
            {
                System.out.print(" ");
            }
            for (int stars = 0; stars < nStars; stars++)
            {
                System.out.print("*");
            }
            nStars = nStars - 2;
            System.out.println();
        }
    }
}