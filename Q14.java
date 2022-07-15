import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class diss1{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenght of three sides of a tringle");

        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int count=0;

        if(a==b)
        {
            count++;
        }
        if(b==c)
        {
            count++;
        }
        if(c==a)
        {
            count++;
        }

        if(count==0)
        {
            System.out.println("Irregular");
        }
        else if(count==1)
        {
            System.out.println("Symmetric");
        }
        else 
        {
            System.out.println("Regular");
        }
       
      
    } 

}
