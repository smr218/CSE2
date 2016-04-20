import java.util.Scanner;// imports Scanner in order to have users input values
public class RemoveElements
{
  public static void main(String [] arg)// main method (given code)
  {
    Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    int newArray1[];
    int newArray2[];
    int index,target;
  	String answer="";
  	do
  	{
  	  System.out.print("Random input 10 ints [0-9]");
    	num = randomInput();
    	String out = "The original array is:";
    	out += listArray(num);
    	System.out.println(out);
    	
      System.out.print("Enter the index ");
      index = scan.nextInt();
      if (index < 0 || index > num.length - 1)//checks to see if index is between 0 and 9
      {
        System.out.println("Your number was not in the range 0-9");// if not doesn't call on range 
        System.out.println(out);
      }
      else 
      {
      newArray1 = delete(num,index);
    	String out1="The output array is ";
      out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
      System.out.println(out1);
      }
   
      System.out.print("Enter the target value ");
    	target = scan.nextInt();
    	newArray2 = remove(num,target);
    	String out2="The output array is ";
    	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
    	System.out.println(out2);
        	 
    	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
    	answer=scan.next();
  	}
      while(answer.equals("Y") || answer.equals("y"));
  }
   
  public static String listArray(int num[])
  {
    String out="{";
    for(int j=0;j<num.length;j++)
    {
    	if(j>0)
    	{
        out+=", ";
    	}
  	  out+=num[j];
    }
    out+="} ";
    return out;
  }
  
  public static int[] randomInput()// randomInput Method
  {
    int num[]=new int[10];// new array of length 10
    for (int i = 0; i < num.length; i++)//make a new random number from 0-9 for every index of the array
    {
      int x = (int)(Math.random()*10);
      num[i] = x;
    }
    return num;
  }
  
  public static int[] delete(int[]array, int y)// delete Method
  {
    int [] array2 = new int[9];// make a new array of length 9 
    for (int j = 0; j < y; j++)// copies all of the original array until it reaches the indicated index
    {
      array2[j] = array[j];
    }
    for (int i = y + 1; i < array.length; i++)// once indicated index is reached, doesn't include that number and puts all other from original array to new array
    {
      array2[y] = array[i];
      y++;
    }
    return array2;
  }
  
  public static int[] remove(int[]array, int y)// remove Method
  {
    int counter = 0;// counter equal to 0
    for (int i = 0; i < array.length; i++)// is used to determine the length of the new array
    {// as long as the indicated number isn't found, the length of the array increases 
      if (array[i] != y)
      {
        counter++;
      }
    }
    int array2[] = new int [counter];// creates a new array
    int counter2 = 0;// second counter equal to 0
    for (int j = 0; j < array.length; j++)// copies all of the numbers that aren't equivialnt to the user input 
    {// to the second array from the first array
      if (array[j] != y)
      {
        array2[counter2] = array[j];
        counter2++;
      }
    }
    return array2;
  }
}