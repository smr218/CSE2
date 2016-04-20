/*

*/

import java.util.Scanner;// imports Scanner in order to have users input values
public class Bowtie//main method required for every Java Program 
{
    public static void main (String[]args)
    {
        Scanner input = new Scanner(System.in);// declares an instance of the Scanner object and constructs it
        int nStars = 9;
        int space = 0;
        int nStars2 = 3;
        int counter = 0;
        for (int x = 0; x < nStars; x++)
        {
            System.out.print("*");
        }
        System.out.println("\n_________\n");
        
        for (int line = 0; line < 9; line++)
        {
            if (line < 4)
            {
                for (space = line; space > 0; space--)
                {
                    System.out.print(" ");
                }
                for (int stars = nStars; stars > 0; stars--)
                {   
                    System.out.print("*");
                }
            }
            if (line == 4)
            {
                for (int midspace = 0; midspace < line; midspace++)
                System.out.print(" ");
                System.out.print("*");
            }
            if (line > 4)
            {
                for (int space2 = 3; space2 > counter; space2--)
                {
                    System.out.print(" ");
                }
                for (int stars2 = 0; stars2 < nStars2; stars2++)
                {
                    System.out.print("*");
                }
                nStars2 = nStars2 + 2;
                counter++;
            }
            System.out.println();
            nStars = nStars - 2;
        }
        System.out.println("\n_________\n");
        
        while (true)
        {
            System.out.println("Choose an odd integer between 3-33");
            boolean check = input.hasNextInt();
            if (check)
            {
                nStars = input.nextInt();
                if (nStars >= 3 && nStars <= 33 && nStars%2 == 1)
                {
                    for ()
                }
                else
                {
                    System.out.println("Enter an ODD integer in the range");
                }
            }
            else
            {
                System.out.println("Enter an INTEGER");
            }
        }
    }
}