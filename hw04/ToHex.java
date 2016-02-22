import java.util.Scanner;
public class ToHex
{
    public static void main (String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter three numbers representing RGB values:");
        boolean r = input.hasNextInt();
        if (input.hasNextInt())
        {
            int R = input.nextInt();
            boolean g = input.hasNextInt();
        if (input.hasNextInt() )
        {
            int G = input.nextInt();
            boolean b = input.hasNextInt();
        if (input.hasNextInt())
        {
            int B = input.nextInt();
            String Hex = "";
            
            if ((R > 255 || R < 0) || (G > 255 || G < 0) || (B > 255 || B < 0))
            {
                System.out.println("Please enter a value within 0-255");
            }
            else 
            {
                int HexR1 = R/16;
                int HexR2 = R%16;
                int HexG1 = G/16;
                int HexG2 = G%16;
                int HexB1 = B/16;
                int HexB2 = B%16;
                switch(HexR1)
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
                        Hex = Hex + HexR1;
                        break;
                }
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
            }
        }
        else 
        {
            System.out.println("Please enter a value that is an interger");
        }
        }
        else 
        {
            System.out.println("Please enter a value that is an interger");
        }
        }
        else 
        {
            System.out.println("Please enter a value that is an interger");
        }
    }
}