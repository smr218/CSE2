/*
Stephan Reyes - hw04 
"Your laptop display or computer monitor use tiny pixels to display what you see on 
your screen. Pixels consist of three colors: Red, Green, and Blue (RGB) which are 
mixed together to produce all of the possible colors that your screen can display. 
RGB are represented by 8-bits, so their values can range from 0 - 255. For example, 
the color white is represented in (R,G,B) as (255, 255, 255) respectively.
You will develop a program which takes decimal RGB values (three inputs) and convert 
them to hexadecimal. "
*/
import java.util.Scanner; // imports Scanner in order to have users input values
public class ToHex //main method required for every Java Program 
{
    public static void main (String[]args) 
    {
        Scanner input = new Scanner(System.in);// declares an instance of the Scanner object and constructs it
        System.out.println("Please enter three numbers representing RGB values:");// tells user to input a number  
        boolean r = input.hasNextInt();// checks to see if the first number is an integer 
        if (input.hasNextInt())// if the check returns true then continues, else tells user to input an integer
        {
            int R = input.nextInt();// makes the first number into an int to be converted to hex
            boolean g = input.hasNextInt();// checks to see if the second number is an integer
        if (input.hasNextInt())// if the check returns true then continues, else tells user to input an integer
        {
            int G = input.nextInt();// makes the second number into an int to be converted to hex
            boolean b = input.hasNextInt();// checks to see if the third number is an integer
        if (input.hasNextInt())// if the check returns true then continues, else tells user to input an integer
        {
            int B = input.nextInt();// makes the third number into an int to be converted to hex
            String Hex = "";// makes a print statement where the hex form will be printed
            
            if ((R > 255 || R < 0) || (G > 255 || G < 0) || (B > 255 || B < 0))// if RGB is greater than 255 or less than 0 tells user to 
            {                                                                 // to input a number betwenn 0-255, else continues conversion
                System.out.println("Please enter a value within 0-255");
            }
            else 
            {
                int HexR1 = R/16;// divides the first number by 16 to get the first hex value
                int HexR2 = R%16;// mods the first number by 16 to get the second hex value
                int HexG1 = G/16;// divides the second number by 16 to get the third hex value
                int HexG2 = G%16;// mods the second number by 16 to get the fourth hex value
                int HexB1 = B/16;// divides the third number by 16 to get the fifth hex value
                int HexB2 = B%16;// mod the third number by 16 to get the sixth hex value
                switch(HexR1)// checks what HexR1 is and adds that number or letter to Hex String
                {
                    case 10://if R1 is 10 does this sequence
                        Hex = Hex + "A";// adds A to Hex String
                        break;// breaks out of the switch statement
                    case 11://if R1 is 11 does this sequence
                        Hex = Hex + "B";// adds B to Hex String
                        break;// breaks out of the switch statement
                    case 12://if R1 is 12 does this sequence
                        Hex = Hex + "C";// adds C to Hex String
                        break;// breaks out of the switch statement
                    case 13://if R1 is 13 does this sequence
                        Hex = Hex + "D";// adds D to Hex String
                        break;// breaks out of the switch statement
                    case 14://if R1 is 14 does this sequence
                        Hex = Hex + "E";// adds E to Hex String
                        break;// breaks out of the switch statement
                    case 15://if R1 is 15 does this sequence
                        Hex = Hex + "F";// adds AF to Hex String
                        break;// breaks out of the switch statement
                    default://if R1 is 0-9 does this sequence
                        Hex = Hex + HexR1;// adds given number of HexR1 to Hex String
                        break;// breaks out of the switch statement
                }
                
                /*THIS SWITCH STATEMENT IS REPEATED 5 MORE TIMES WITH HexR2, HexB1, HexB2, HexG1, HexG2 
                AS TO CONVERT ALL THE GIVEN DECIMAL VALUES TO HEXADECIMAL*/
                
                switch(HexR2)
                {
                    case 10:
                        Hex = Hex + "A";
                        break;
                    case 11:
                        Hex = Hex + "B";
                        break;
                    case 12:
                        Hex = Hex + "C";
                        break;
                    case 13:
                        Hex = Hex + "D";
                        break;
                    case 14:
                        Hex = Hex + "E";
                        break;
                    case 15:
                        Hex = Hex + "F";
                        break;
                    default:
                        Hex = Hex + HexR2;
                        break;
                }
                switch(HexG1)
                {
                    case 10:
                        Hex = Hex + "A";
                        break;
                    case 11:
                        Hex = Hex + "B";
                        break;
                    case 12:
                        Hex = Hex + "C";
                        break;
                    case 13:
                        Hex = Hex + "D";
                        break;
                    case 14:
                        Hex = Hex + "E";
                        break;
                    case 15:
                        Hex = Hex + "F";
                        break;
                    default:
                        Hex = Hex + HexG1;
                        break;
                }
                switch(HexG2)
                {
                    case 10:
                        Hex = Hex + "A";
                        break;
                    case 11:
                        Hex = Hex + "B";
                        break;
                    case 12:
                        Hex = Hex + "C";
                        break;
                    case 13:
                        Hex = Hex + "D";
                        break;
                    case 14:
                        Hex = Hex + "E";
                        break;
                    case 15:
                        Hex = Hex + "F";
                        break;
                    default:
                        Hex = Hex + HexG2;
                        break;
                }
                switch(HexB1)
                {
                    case 10:
                        Hex = Hex + "A";
                        break;
                    case 11:
                        Hex = Hex + "B";
                        break;
                    case 12:
                        Hex = Hex + "C";
                        break;
                    case 13:
                        Hex = Hex + "D";
                        break;
                    case 14:
                        Hex = Hex + "E";
                        break;
                    case 15:
                        Hex = Hex + "F";
                        break;
                    default:
                        Hex = Hex + HexB1;
                        break;
                }
                switch(HexB2)
                {
                    case 10:
                        Hex = Hex + "A";
                        break;
                    case 11:
                        Hex = Hex + "B";
                        break;
                    case 12:
                        Hex = Hex + "C";
                        break;
                    case 13:
                        Hex = Hex + "D";
                        break;
                    case 14:
                        Hex = Hex + "E";
                        break;
                    case 15:
                        Hex = Hex + "F";
                        break;
                    default:
                        Hex = Hex + HexB2;
                        break;
                }
                System.out.println("The decimal numbers R:" + R + " , G:" + G + " , B:" + B + ", is represented in hexadecimal as: "+ Hex);
                // Prints out the given decimal numbers in hexadecimal format
            }
        }
        else //Prints this out if the third value wasn't an integer
        {
            System.out.println("Please enter a value that is an integer");
        }
        }
        else //Prints this out if the second value wasn't an integer
        {
            System.out.println("Please enter a value that is an integer");
        }
        }
        else //Prints this out if the third value wasn't an integer
        {
            System.out.println("Please enter a value that is an integer");
        }
    }
}