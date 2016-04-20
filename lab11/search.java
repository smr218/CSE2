import java.util.Scanner;// imports Scanner in order to have users input values
public class search//main method required for every Java Program 
{
    public static void main (String[]args)
    {
        int[] array1 = new int[50];
        int[] array2 = new int[50];
        int largest = 0;
        int smallest = 100;
        int largest2 = 0;
        int smallest2 = 1000000000;
        int x = 0;
        int y = 101;
        for (int i = 0; i < array1.length; i++)
        {
            int random = (int)(Math.random()*101);
            array1[i] = random;
            if (array1[i] < smallest)
            {
                smallest = array1[i];
            }
            if (array1[i] > largest)
            {
                largest = array1[i];
            }
        }
        System.out.println("Smallest in array1: " + smallest);
        System.out.println("Largest in array1: "+ largest);
        for (int j = 0; j < array2.length;j++)
        {
            int random2 = (int)(Math.random()*101) + x;
            array2[j] = random2;
            x = array2[j] + 1;
            if (array2[j] < smallest2)
            {
                smallest2 = array2[j];
            }
            if (array2[j] > largest2)
            {
                largest2 = array2[j];
            }
        }
        System.out.println("Smallest in array2: " + smallest2);
        System.out.println("Largest in array2: "+ largest2);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an int: ");
        if (input.hasNextInt())
        {
            int integer = input.nextInt();
            if (integer < 0)
            {
                System.out.println("You didn't pick and int greater than 0");
            }
            else
            {
                int highIndex = array2.length - 1;
                int lowIndex = 0;
                while (lowIndex <= highIndex)
                {
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
                        System.out.println("You got it");
                        break;
                    }
                }
                if (lowIndex >= highIndex)
                {
                    System.out.println(integer + " was not found");
                    if (highIndex == -1)
                    {
                        System.out.println("The number above is " + array2[highIndex + 1]);
                        System.out.println("There is no number below");
                    }
                    else if (lowIndex == array2.length)
                    {
                        System.out.println("There is no number above");
                        System.out.println("The number below is " + array2[lowIndex - 1]);
                    }
                    else
                    {
                        System.out.println("The number above is " + array2[highIndex + 1]);
                        System.out.println("The number below is " + array2[lowIndex - 1]);
                    }
                }
            }
        }
        else 
        {
            System.out.println("You didn't pick an int");
        }
    }
}