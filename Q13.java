import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class diss1{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the mark of student");
        int x = sc.nextInt();
        x=x/10;

        switch(x)
        {
            case 9:
            System.out.println("Grade is O");
            break;

            case 8:
            System.out.println("Grade is A");
            break;

            case 7:
            System.out.println("Grade is B");
            break;

            case 6:
            System.out.println("Grade is C");
            break;

            case 5:
            System.out.println("Grade is D");
            break;

            case 4:
            System.out.println("Grade is E");
            break;

            default:
            System.out.println("Grade is F");
        }
       
      
    } 

}
