/*
Stephan Reyes
GUESSTHEBOX: In this game the user has a choice of box 1, 2, or 3, and in one of them is 
a prize. If the user does not enter one of those three numbers, print an 
error message and ask them to try again. Use a random number generator to 
decide which box has the prize, and if the user picks the correct box print
out a congratulatory message and tell them what their prize is. 

SPINTHEWHEEL: The wheel has 10 sections. Half of them are red and half of 
them are black. Each of the sections has an integer from 1-5 on it. i.e. 
the sections are red 1, red 2, red 3, red 4, red 5, black 1, black 2, 
black 3, black 4, and black 5. The user must input an color and a number 
as a guess. The wheel is then “spun” and the program should print out what 
the result of the spin was and if it matches the user’s guess. The program 
should be able to accept any capitalization (of the first letter) for the 
color name. If the user gives an input that is not an option ask them to try again.

SCRAMBLER:Generate word scramble puzzle. Accept a word from the 
user and scramble the letters of the word. Returned the scrambled word.
*/
import java.util.Random;// imports Random in order to create a random number
import java.util.Scanner;// imports Scanner in order to have users input values
public class Games//main method required for every Java Program 
{
    public static void main (String[]args)// MAIN METHOD
    {
        Scanner input = new Scanner(System.in);//declares an instance of the Scanner object and constructs it
        System.out.println("Welcome to I'M TOO LAZY THINK OF A NAME game center\nChoose one of three following games guessTheBox, spinTheWheel, and scrambler by typing the name of the game you want to play");
        String check = input.next();// checks to see what the user input
        if (check.equals("guessTheBox"))// if the user input "guessTheBox" continues
        {
            guessTheBox();// calls on guessTheBox method
        }
        else if (check.equals("spinTheWheel"))// if the user input "spinTheWheel" continues
        {
            spinTheWheel();// calls on spinTheWheel method
        }
        else if (check.equals("scrambler"))// if the user input "scrambler" continues
        {
            scrambler();// calls on scrambler method
            }
        else// else tells the user that the arcade doesn't have a that game and quits out
        {
            System.out.println("You didn't choose a game that we have :(");
        }
        
    }
    public static void guessTheBox()// guessTheBox Method
    {
        Scanner input = new Scanner(System.in);// /declares an instance of the Scanner object and constructs it
        int correctBox = (int)((Math.random()*3) + 1);// randomly generates a number 1-3
        while (true)// loops the code until break
        {
            System.out.println("Pick a Box: 1, 2, or 3????");// tells the user to input a number
            boolean checkBox = input.hasNextInt();// checks to see if an int was input
            if (checkBox)// if input was an int continues else tells user to input an integer
            {
                int checkBoxNumber = input.nextInt();// converts the input into an integer
                if (checkBoxNumber == 1 || checkBoxNumber == 2 || checkBoxNumber == 3)// checks to see if 1 2 or 3 were chosen, if not tells the user to input one of those numbers
                {
                    if (checkBoxNumber == correctBox)// if their input was correct then they win and win a prize else they lose
                    {
                        System.out.println("YOU'RE SO SMART YOU GUESSED IT; you win the satisfaction of know you're good at guessing :D");
                    }
                    else 
                    {
                        System.out.println("Aww wrong box; Better luck next time");
                    }
                    break;// breaks out of loop
                }
                else
                {
                    System.out.println("You didnt pick 1, 2 or 3");
                    input.nextLine();// restarts loop
                }
            }
            else
            {
                System.out.println("You didn't enter a number");
                input.nextLine();// restarts loop
            }
        }
    }
    public static void spinTheWheel()// spinTheWheel Method
    {
        Scanner input = new Scanner(System.in);//declares an instance of the Scanner object and constructs it
        int correctColor = (int)((Math.random()*2) + 1);// randomly generates a number between 1 and 2
        int correctNumber = (int)((Math.random()*5) + 1);// randomly generates a number between 1 and 5
        while(true)// loops the code until break
        {
            System.out.println("Pick a color between black and red");
            String colorChoice = input.next();// makes the users input into a string statement
            colorChoice = colorChoice.toLowerCase();// converts user input to lowercase 
            if (colorChoice.equals("black") || colorChoice.equals("red"))// checks to see if the user input is black or red, if not then tells user to chose black or red
            {
                String Color = "";// empty string statement Color
                if (correctColor == 1)// if the first random number was 1 the correct Color is black if not then it's red
                {
                    Color = "black";
                }
                else 
                {
                    Color = "red";
                }
                System.out.println("Choose a number from 1 - 5");
                boolean checkNumber = input.hasNextInt();// checks to see if the user input a number 
                {
                    if (checkNumber)// if the user did then continues else tells the user to input an integer
                    {
                        int numberChoice = input.nextInt();// converts the user input to an integer
                        if (numberChoice == 1 || numberChoice == 2 || numberChoice == 3 || numberChoice == 4 || numberChoice == 5)// checks to see if the user input 1-5 else starts over
                        {
                            if (colorChoice.equals(Color))// if they chose the right color continues else tells the user they were wrong and what the right number was 
                            {
                                if (numberChoice == correctNumber)// if they chose the right number they win else tells user they guessed the color but not the number
                                {
                                    System.out.println("YOU GUESSED RIGHT YOU'RE A GENIUS");
                                }
                                else
                                {
                                    System.out.println("You guessed the right color but not the right number; the right number was " + correctNumber);
                                }
                            }
                            else
                            {
                               System.out.println("You didn't choose the right color and the number was " + correctNumber);
                            }
                            break;// breaks out of infinite loop
                        }
                        else 
                        {
                            System.out.println("You MUST enter a number between 1 and 5");
                            input.nextLine();//restarts loop
                        }
                    }
                    else
                    {
                        System.out.println("Enter a NUMBER");
                        input.next();// restarts loop
                    }
                }
            }
            else 
            {
                System.out.println("Choose one of the colors");
                input.nextLine();// restarts loop
            }
        }
    }
    public static void scrambler()// scrambler Method
    {
        Scanner input = new Scanner(System.in);//declares an instance of the Scanner object and constructs it
        Random randomGenerator = new Random();// declares an instance of the Random object and constructs it
        while (true)// loops the code until break
        {
            System.out.println("Enter a word");
            boolean check = input.hasNext();// check to see if the user input 
            if(check)// if the user input an int continue else try again
            {
                String wordBefore = input.next();// converts input to a string
                String wordAfter = wordBefore;// seperate string to compare with original input late
                while (wordBefore.equals(wordAfter))// as long as the 2 strings are the same scrambles the words
                {
                    for (int a = 0; a < wordBefore.length(); a++)// scrambles the word
                    {
                        int x = randomGenerator.nextInt(wordBefore.length());// random int in the first string
                        char c = wordBefore.charAt(x);// sets c to the char at the random int
                        String scrambled = Character.toString(c);// sets chartacter c to a string 
                        for (int b = 1; b < wordBefore.length(); b++)// scrambles the word
                        {
                            if (b !=  x)// see if the random number doesn't equal b and stores that letter
                            {
                                scrambled = scrambled + Character.toString(wordBefore.charAt(b));
                            }
                            else // else stores it to first letter
                            {
                                scrambled = scrambled + Character.toString(wordBefore.charAt(0));
                            }
                        }
                        wordAfter = scrambled;// sets word after to the new String
                    }
                }
                System.out.println("The scrambled word is: " + wordAfter);// prints out the new string and breaks
                break;
            }
            else
            {
                System.out.println("Enter a word");
                input.nextLine();// restarts loop
            }
        }
        
    }
}