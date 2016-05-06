import java.util.Scanner;// imports Scanner in order to have users input values
import java.util.Arrays;
public class Holoporter
{
    public static void main(String [] args)
    {
        String array1[][][] = print(soRandom());
        holoport(array1, soRandom());
    }
    public static String[][][] soRandom()
    {
        int random1 = (int)(Math.random()*10) + 1;
        int random2 = (int)(Math.random()*10) + 1;
        int random3 = (int)(Math.random()*10) + 1;
        String array1[][][] = new String [random1][random2][random3];
        System.out.println(random1 + " " + random2 + " " + random3);
        return array1; 
    }
    public static String coder()
    {
        String code = "";
        for (int i = 0; i < 2; i++)
        {
            int random1 = (int)(Math.random()*26);
            char X = (char)('A' + random1);
            code = code + X;
        }
        for (int j = 0; j < 4; j++)
        {
            int Y = (int)(Math.random()*10);;
            code = code + Y;
        }
        return code;
    }
    public static void holoport(String [][][] array1, String [][][] array2)
    {
        int a1 = array1.length;
        int a2 = array2.length;
        int b1 = array1[a1 - 1].length;
        int b2 = array2[a2 - 1].length;
        int c1 = array1[a1 - 1][b1 - 1].length;
        int c2 = array2[a2 - 1][b2 - 1].length;
        if (a1 < a2)
        {
            for (int i = 0; i < array1.length; i++)
            {
                System.out.print("[");
                for (int j = 0; j < array1[i].length; j++)
                {
                    for (int k = 0; k < array1[i][j].length; k++)
                    {
                        System.out.print(array1[i][j][k]);
                        if (k < (array1[i][j].length - 1))
                        {   
                            System.out.print(", ");
                        }
                    }
                    System.out.print("]");
                    if (j < array1[i].length - 1)
                    {
                        System.out.print(" | [");
                    }
                }
                if (i < array1.length - 1)
                {
                    System.out.print(" -- ");
                }
            }
            System.out.print(" -- ");
            for (int i = a1; i < array2.length; i++)
            {
                System.out.print("[");
                for (int j = 0; j < array2[i].length; j++)
                {
                    for (int k = 0; k < array2[i][j].length; k++)
                    {
                        System.out.print("$$$$$$");
                        if (k < (array2[i][j].length - 1))
                        {   
                        System.out.print(", ");
                        }
                    }
                    System.out.print("]");
                    if (j < array2[i].length - 1)
                    {
                        System.out.print(" | [");
                    }
                }
                if (i < array2.length - 1)
                {
                    System.out.print(" -- ");
                }
            }
        }
        else
        {
            for (int i = 0; i < array1.length; i++)
            {
                System.out.print("[");
                for (int j = 0; j < array1[i].length; j++)
                {
                    for (int k = 0; k < array1[i][j].length; k++)
                    {
                        System.out.print(array1[i][j][k]);
                        if (k < (array1[i][j].length - 1))
                        {   
                            System.out.print(", ");
                        }
                    }
                    System.out.print("]");
                    if (j < array1[i].length - 1)
                    {
                        System.out.print(" | [");
                    }
                }
                if (i < array1.length - 1)
                {
                    System.out.print(" -- ");
                }
            }
            if (b1 < b2)
            {
                 for (int i = 0; i < array2.length; i++)
                {
                System.out.print("[");
                for (int j = b1; j < array2[i].length; j++)
                {
                    for (int k = 0; k < array2[i][j].length; k++)
                    {
                        System.out.print("$$$$$$");
                        if (k < (array2[i][j].length - 1))
                        {   
                        System.out.print(", ");
                        }
                    }
                    System.out.print("]");
                    if (j < array2[i].length - 1)
                    {
                        System.out.print(" | [");
                    }
                }
                if (i < array2.length - 1)
                {
                    System.out.print(" -- ");
                }
            }
            }
            else 
            {
                for (int i = 0; i < array2.length; i++)
                {
                    System.out.print("[");
                    for (int j = 0; j < array2[i].length; j++)
                    {
                        for (int k = 0; k < array2[i][j].length; k++)
                        {
                            System.out.print(array1[i][j][k]);
                            if (k < (array2[i][j].length - 1))
                            {   
                            System.out.print(", ");
                            }
                        }
                        System.out.print("]");
                        if (j < array2[i].length - 1)
                        {
                            System.out.print(" | [");
                        }
                    }
                    if (i < array2.length - 1)
                    {
                        System.out.print(" -- ");
                    }
                }
            }
        }
    }
    public static void sampling()
    {
        
    }
    public static void percentage()
    {
        
    }
    public static void frankenstein()
    {
        
    }
    public static String[][][] print(String [][][] array1)
    {
        for (int i = 0; i < array1.length; i++)
        {
            System.out.print("[");
            for (int j = 0; j < array1[i].length; j++)
            {
                for (int k = 0; k < array1[i][j].length; k++)
                {
                    boolean flag = false;
                    while (flag == false)
                    {
                        flag = false;
                        array1[i][j][k] = coder();
                        for (int a = 0; a < array1.length; a++)
                        {
                            for (int b = 0; b < array1[a].length; b++)
                            {
                                for (int c = 0; c < array1[a][b].length; c++)
                                {
                                    if (array1[i][j][k] == array1[a][b][c])
                                    {
                                        flag = false;
                                    }
                                    else 
                                    {
                                        flag = true;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    System.out.print(array1[i][j][k]);
                    if (k < (array1[i][j].length - 1))
                        {   
                        System.out.print(", ");
                        }
                }
                System.out.print("]");
                if (j < array1[i].length - 1)
                {
                    System.out.print(" | [");
                }
            }
            if (i < array1.length - 1)
            {
                System.out.print(" -- ");
            }
        }
        System.out.println();
        return array1;
    }
}


