import java.util.Scanner;// imports Scanner in order to have users input values
import java.util.Arrays;// imports Arrays in order to transform arrays
public class CSE2Linear//main method required for every Java Program 
{
    public static void main (String[]args)// MAIN METHOD
    {
        System.out.println("Enter 15 ints");// tells user to enter 15 INTS
        Scanner input = new Scanner(System.in);// Scanner to have user input
        int counter = 0;// counter 
        int[] array1 = new int[15];// array of length 15
        while (counter < 15)// as long as counter is less than 15 loops
        {
            if (input.hasNextInt())// checks to see if user input is an integer
            {
                array1[counter] = input.nextInt();// if so saves it as an integer
                if (array1[counter] < 0 || array1[counter] > 100)// checks to see if the user input is greater than 100 or less than 0
                {
                    System.out.println("You didn't enter an int within the range 0-100");// if so then prints error and ends program
                    System.exit(0);
                }
                else// if not continues
                {
                    if (counter > 0)// if the counter is greater than 0
                    {
                        if (array1[counter] < array1[counter - 1])// check to make sure the latest input is greater than the previous number
                        {
                            System.out.println("You didn't enter an intger greater than the last one ");// if not then prints error and ends program
                            System.exit(0);
                        }
                    }
                counter++;// increments counter
                }
            }
            else // since input isn't an int
            {
                System.out.println("You didn't enter an integer");// prints error message and ends program
                System.exit(0);
            }
        }
        System.out.println("Sorted: ");// prints "Sorted: "
        System.out.println(Arrays.toString(array1));// converts array to a string statement to be printed out
        System.out.print("Enter a grade to search for: ");// tells user to enter a grade to search for
        if (input.hasNextInt())// checks to see if the user input an int
        {
            int x = input.nextInt();// if integer was input saves as int
            BinarySearch(array1, x);// calls on LinearSearch Method
            Scramble(array1);// calls on Scramble Method
            System.out.println("Scrambled:");// prints "Scrambled:"
            System.out.println(Arrays.toString(array1));// coverts scrambled array to string statement to be printed out
            System.out.print("Enter a grade to search for: ");// tells the user to enter a number to search for
            if (input.hasNextInt())// check to see if the user input an int
            {
                LinearSearch(array1,x);// if user entered an int calls on LinearSearch Method
            }
            else// else prints error message and ends program
            {
                System.out.println("You didn't enter an integer");
                System.exit(0);
            }
        }
        else // if not then prints an error and ends program
        {
            System.out.println("You didn't enter a grade to seach for");
            System.exit(0);
        }
    }
    
    public static void LinearSearch(int[] array1, int x)// LinearSearch method
    {
        for (int i = 0; i < array1.length; i++)// loops as long as int i is less than length of array 
        {
            if (array1[i] == x)// checks to see if the number at given position is equal to the user input
            {
                System.out.println(x + " was found in the list in " + (i + 1) + " iterations");// if so then prints where it was found
                break;
            }
            else if (array1[i] != x && i == (array1.length - 1))//if user input wasn't found after 15 iterations prints statement below
            {
                System.out.println(x + " was not found in " + (i + 1) + " iterations");
            }
        }
    }
    public static int[] Scramble(int[] array1)// Scramble method
    {
        for (int i = 0; i < array1.length; i++)// loops for the length of the array 
        {
            int x = (int)(Math.random()*array1.length);// random number 
            int store = array1[i];// temporarily stores number at i index in array
            while (x != i)// as long as the random number isn't equal to i switches index of i with index of random number
            {
                array1[i] = array1[x];
                array1[x] = store;
                break;
            }
        }
        return array1;
    }
    public static void BinarySearch(int[] array2, int integer)
    {
        int highIndex = array2.length - 1;
        int lowIndex = 0;
        int counter = 0;
        while (lowIndex <= highIndex)
        {
            counter++;
            int midIndex = (highIndex + lowIndex)/2;
            if (integer < array2[midIndex])
            {
                highIndex = midIndex - 1;
            }
            else if (integer > array2[midIndex])
            {
                lowIndex = midIndex + 1;   
            }
            else if (integer == array2[midIndex])
            {
                System.out.println(integer + " was found in " + counter + "iterations");
                break;
            }
        }
        if (lowIndex >= highIndex)
        {
            System.out.println(integer + " was not found in " + counter + " iterations");
        }
    }
}