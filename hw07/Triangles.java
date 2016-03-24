/*
Stephan Reyes
Write a program that forces the user to enter an integer between 5 and 30, inclusive, 
and then prints out displays that depend on the value entered.
DO SO USING FOR LOOPS, WHILE LOOPS, AND DO WHILE LOOPS
*/
import java.util.Scanner;// imports Scanner in order to have users input values
public class Triangles//main method required for every Java Program 
{
    public static void main (String[]args)
    {
        while (true)// loops the code until break statement 
        {
            Scanner input = new Scanner(System.in);// declares an instance of the Scanner object and constructs it
            System.out.print("Please enter and integer between 5 and 30 (inclusive) ");// tells the user to input an integer between 5 and 30
            boolean check = input.hasNextInt();//checks to see if the value is an integer
            if (check)// if the value is an integer then it continues else it tells the user to enter an INT
            {
                int x = input.nextInt();// turns the inputed value into an integer
                int hightri;// declares int hightri 
                int lowtri;// declares int lowtri
                int hightri2;// declares int hightri 
                int lowtri2;// declares int lowtri
                int hightri3;// declares int hightri 
                int lowtri3;// declares int lowtri
                if (x >= 5 && x <= 30)// if the input is between 5 and 30 continues else tell the user to input an int BETWEEN 5 and 30
                {
                    ///////////// FOR ////////////////
                    for (hightri = 1; hightri < x; hightri++)// prints a new line feed until hightri equals the number input by user
                    {
                        for (int count1 = hightri; count1 > 0; count1 --)// prints hightri the same number of times as hightri (ex. prints #2 two times)
                        {
                            System.out.print(hightri);
                        }
                        System.out.println();
                    }
                    
                    for (lowtri = x; lowtri > 0; lowtri--)// prints a new line feed until lowtri equals 0
                    {
                        for (int count2 = lowtri; count2 > 0; count2 --)// prints lowtri the same number of times as lowtri (ex. prints #5 five times)
                        {
                            System.out.print(lowtri);
                        }
                        System.out.println();
                    }
                    ///////////////// WHILE ///////////////
                    hightri2 = 1;// sets hightri2 equal to 1
                    lowtri2 = x;// sets lowtri2 equal to input value
                    while (hightri2 < x)//while hightri2 is less than input value, continues to set count3 to hightri2, prints a new line, and increments hightri2
                    {
                        int count3 = hightri2;// sets count3 to hightri2
                        while (count3 > 0)//while count3 is greater than 0,continues to print the number of hightri and then decremenets count3
                        {
                            System.out.print(hightri2);
                            count3--;// decrements count3
                        }
                        System.out.println();
                        hightri2++;// increases hightri2
                    }
                    
                    while (lowtri2 > 0)//while lowtri2 is greater than 0, continues to set count4 to lowtri2, prints a new line, and decrements lowtri2
                    {
                        int count4 = lowtri2;// sets count4 to lowtri2
                        while (count4 > 0)//while count4 is greater than 0,continues to print the number of lowtri and then decremenets count4
                        {
                            System.out.print(lowtri2);
                            count4--;//decremenets count4
                        }
                        System.out.println();
                        lowtri2--;// decreases lowtri2
                    }
                    //////////// DO WHILE //////////////////
                    hightri3 = 1;//sets hightri2 equal to 1
                    lowtri3 = x;//sets lowtri2 equal to input value
                    do //makes the comuputer do this sequence at least once before breaking
                    {
                        int count5 = hightri3;// sets count5 to hightri3
                        do //makes the computer do this sequence at least once before breaking
                        {
                            System.out.print(hightri3);// prints the number of hightri3
                            count5--;// decrements count5
                        }
                        while(count5 > 0);// does the second do statement as long as count5 is greater than 0
                        System.out.println();//prints a new line
                        hightri3++;// increments hightri3
                    }
                    while(hightri3 < x);//does the first do statement as long hightri3 is less than the input value
                
                    do  //makes the comuputer do this sequence at least once before breaking
                    {
                        int count6 = lowtri3;
                        do  //makes the comuputer do this sequence at least once before breaking
                        {
                            System.out.print(lowtri3);// prints lowtri3
                            count6--;// decreases count6
                        }
                        while(count6 > 0);// does the second do statement as lonf as count6 is greater than 0
                        System.out.println();// prints a new line
                        lowtri3--;// decreases lowtri3
                    }
                    while(lowtri3 > 0);// does the first print statement as long as lowtri3 is greater than 0
                    break;// breaks out of the infinte code
                }
                else
                {
                    System.out.println("Please enter an int BETWEEN 5 and 30");
                    input.nextLine();//loops back to the beginning of the code
                }
            }
            else 
            {
                System.out.println("Please enter an INTEGER");
                input.next();// loops back to the beginning of the code
            }
        }
    }
}