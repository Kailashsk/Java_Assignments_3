import java.util.Scanner;

public class diss1{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the charecter");
            char a = sc.nextLine().charAt(0);
            int n = (int)(a);
            if (n>=65 && n<=90)
            {
                System.out.println("Capital letter");
            }
            else if (n>=97 && n<=122)
            {
                System.out.println("Small letter");
            }
            else if (n>=48 && n<=57)
            {
                System.out.println("Digit");
            }
            else
            {
                System.out.println("Special charecter");
            }
    } 

}
