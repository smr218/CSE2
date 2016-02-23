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
            suit = " of Diamonds";
        }
        else if (card > 13 && card <= 26)
        {
            suit = " of Clubs";
        }
        else if (card > 26 && card <= 39)
        {
            suit = " of Hearts";
        }
        else
        {
            suit = " of Spades";
        }
        
        switch(num)
        {
            case 0:
                number = "You picked the Ace";
                break;
            case 11:
                number = "You picked the Jack";
                break;
            case 12:
                number = "You picked the Queen";
                break;
            case 13:
                number = "You picked the King";
                break;
            default:
                number = "You picked the " + num;
                break;
        }
        System.out.println(number + suit);
    }
}