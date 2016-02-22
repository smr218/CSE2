import java.util.Scanner;
public class CardGenerator
{
    public static void main (String[]args)
    {
        int card = (int)(Math.random()*52)+1;
        int num = card%13;
        String suit = "";
        String number = "";
        
        if (card <= 13)
        {
            suit = "of Diamonds";
        }
        else if (card > 13 && card <= 26)
        {
            suit = "of Clubs";
        }
        else if (card > 26 && card <= 39)
        {
            suit = "of Hearts";
        }
        else
        {
            suit = "of Spades";
        }
        
        switch(num)
        {
            case 0:
                number = "You picked the Ace ";
                break;
            case 1:
                number = "You picked the 1 ";
                break;
            case 2:
                number = "You picked the 2 ";
                break;
            case 3:
                number = "You picked the 3 ";
                break;
            case 4:
                number = "You picked the 4 ";
                break;
            case 5:
                number = "You picked the 5 ";
                break;
            case 6:
                number = "You picked the 6 ";
                break;
            case 7:
                number = "You picked the 7 ";
                break;
            case 8:
                number = "You picked the 8 ";
                break;
            case 9:
                number = "You picked the 9 ";
                break;
            case 10:
                number = "You picked the 10 ";
                break;
            case 11:
                number = "You picked the Jack ";
                break;
            case 12:
                number = "You picked the Queen ";
                break;
            case 13:
                number = "You picked the King ";
                break;
        }
        System.out.println(number + suit);
    }
}