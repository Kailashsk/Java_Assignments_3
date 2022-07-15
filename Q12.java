import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class diss1{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year of the person");
        int n=sc.nextInt();

        if(n<1996)
        {
            System.out.println("Generation is O");
        }
        else if(n>1966 && n<1980)
        {
            System.out.println("Generation is X");
        }
        else if(n>1981 && n<1999)
        {
            System.out.println("Generation is Y");
        }
        else if(n>2000 && n<2012)
        {
            System.out.println("Generation is Z");
        }
        else 
        {
            System.out.println("Generation is K");
        }
      
    } 

}
