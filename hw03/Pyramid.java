/*
Stephan Reyes
This program converts the users dimensions
of a pyramid (length and height) into it's volume
*/
import java.util.Scanner;// imports scanner in order to have the user type their values
public class Pyramid
{
    public static void main (String[]args)
    {
        Scanner input = new Scanner(System.in);// declares an instance of a Scanner object and constructs is
        System.out.print("The square side of the pyramid is (input length): ");// asks the user to input a length for the pyramid
        double length = input.nextDouble();// reads the user's length input
        System.out.print("The height of the pyramid is (input height): ");//asks the user to input a height for the pyramid
        double height = input.nextDouble();// reads the user's height input
        System.out.println("The volume inside the pyramid is: " + ((int)(100*(length*length*height)/3)/100.0));// converts the length and height to volume using sides * height all divided by 3
    }
}