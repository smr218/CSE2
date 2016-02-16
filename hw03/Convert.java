/*
Stephan Reyes
This program converts meters inputed 
by the user into inches. 
*/

import java.util.Scanner; //imports Scanner in order to have the user type their values

public class Convert
{
    public static void main (String [] args)
    {
        Scanner input = new Scanner(System.in); //declares an instance of a Scanner object and constructs it
        System.out.print("Enter the distance in meters: ");//tells the user to choose a value for meters
        double meters = input.nextDouble();//allows user to select a value for meters
        double inches = (int)(10000*(meters * 39.3701))/10000.0;// converts meters to inches
        System.out.println(meters + " meters is " + inches + " inches");// prints meters in inches
    }
}