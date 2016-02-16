import java.util.Scanner;//imports Scanner in order to have the user type their values
public class Check
{
    public static void main (String[]args)
    {
        Scanner input = new Scanner(System.in);//declares an instance of the Scanner object and constructs it 
        System.out.print("Enter the original cost of the check (in the form xx.xx): ");//tells the user to input a value for the check
        double check = input.nextDouble();// allows the user to input the cost of the check
        System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): " );//tells the user to input a value for the tip
        double tip = (input.nextDouble() / 100);// allows the user to input the tip value and devides by 100
        System.out.print("Enter the number of people who went out to dinner: ");// tells the user to input amount of people at the dinner
        int people = input.nextInt();// allows the user to input the amount of people
        double totalCost = check * (1 + tip);// calculates the total cost of the check with tip
        double costPerPerson = (totalCost / people);// divides the total cost among everyone at the dinner
        int dollars = (int)(costPerPerson);// next three lines properly show the amount of dollars, dimes and pennies (cost) for each person
        int dimes = (int)(costPerPerson * 10) % 10;
        int pennies = (int)(costPerPerson * 100) % 10;
        System.out.println("Each person in the group owes $" + dollars + '.' + dimes + pennies);// prints out the total cost for each person
    }
}