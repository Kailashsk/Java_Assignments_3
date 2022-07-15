import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class diss1{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your gender (M or F) :");
        char g=sc.nextLine().charAt(0);
        System.out.println("First Name :");
        String f=sc.nextLine();
        System.out.println("Last Name :");
        String l=sc.nextLine();
        System.out.println("Age :");
        int a=sc.nextInt();

        if(g>=20 && g=='F')
        {
            System.out.println("Are you married, "+f+" (y or n" +" ?");
            sc.nextLine();
            char m=sc.nextLine().charAt(0);
            if(m=='Y')
            {
                System.out.println("Then I shall call you Mrs." +f+" "+l);
            }
            else
            {
                System.out.println("Then I shall call you Ms." +f);
            }
        }
        else
        {
            if(g>=20)
            {
                System.out.println("Then I shall call you Mr. "+f);
            }
            else
            {
                System.out.println("Then I shall call you "+f +" "+l);
            }
        }
       
      
    } 

}
