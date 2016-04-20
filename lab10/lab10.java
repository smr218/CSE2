import java.util.Scanner;// imports Scanner in order to have users input values
public class lab10//main method required for every Java Program 
{
    public static void main (String[]args)
    {
        int x = (int)(Math.random()*6)+ 5;
        String[] students= new String[x];
        int[] midterm = new int[x];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter " + x + " student names:");
        for (int i = 0; i < students.length; i++)
        {
            int y = (int)(Math.random()*101);
            if (input.hasNext())
            {
                students[i] = input.next();
                midterm[i] = y;
            }
        }
        System.out.println("\nHere are the midterm grades of the " + x + " students above:");
        for (int j = 0; j < students.length; j++)
        {
            System.out.println(students[j] + ":" + midterm[j]);
        }
    }
}
