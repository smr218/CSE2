//import scanner
import java.util.Scanner;
//TwistGenerator class
public class TwistGenerator  //main method
{ 
    public static void main(String[] args)
    {
        Scanner input = new Scanner( System.in );
        int check = 0;
        while( check == 0 ) 
        {
            System.out.println("Please enter a postive integer to indicate length of twist");
            if( input.hasNextInt() )
            {
                int length = input.nextInt();
                if( length > 0 ) 
                {
                    check++;
                    int cross = (length - 1) / 3;
                    int slash = length;//(2*cross) + 1;
                    int count1 = 0;
                    int count2 = 0;
                    int count3 = 0;
                    while(count1 < slash)
                    {
                        System.out.print("\\ ");
                        count1+=2;
                        if ( count1 < slash )
                        {
                            System.out.print("/");
                            count1++;
                            
                        }// end of if statment 
                    }// end of while loop 
                    System.out.println("");
                    while( count2 < cross )
                    {
                        System.out.print(" X ");
                        count2++;
                    }//end of while loop 
                    System.out.println("");
                    while( count3 < slash )
                    {
                        System.out.print("/ ");
                        count3+=2;
                        if (count3 < slash)
                        {
                            System.out.print("\\");
                            count3++;
                            
                        }//end of if statement 
                    }//end of while loop
                }// end of if statement 
                else
                {
                    System.out.println("You did not enter a postive integer");
                }
            }// end of if statement 
            else
            {
                System.out.println("You did not enter an integer");
                input.next();
            }//end of else statement
        }// end of while loop 
    }// end of main method
}// end of class