import java.util.Scanner;
public class practice
{ 
    public static void main (String [] args)
    {
        /*Scanner input = new Scanner(System.in);
        int x = (int)(Math.random()*4)+1;
        System.out.println(x);
        String s = "fall", t = "break";
        double w, y =3.2;
        w = 3.2;
        */
        
        String s = "fall";
        String t = "break";
        String cont = s + t;
        
        boolean test = ((s + t) == cont);
        
        System.out.println(test);
        System.out.println(cont.equals("fallbreak"));
        
        double x = 1/2.0;
        System.out.println(x);

        
        int i = 1;
        float j = 1;
        
        i++;
        ++j;
        
        System.out.println(i);
        System.out.printf(" you owe %10.2f\n" , j);
        int y = (int)(Math.random()*4)+1;
        System.out.println(y)
;    }
}