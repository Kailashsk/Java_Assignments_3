import java.util.Scanner;

public class diss1{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Input the 1st number");
            double x = sc.nextDouble();
            System.out.println("Input the 2nd number");
            double y = sc.nextDouble();
            if ((x>0.0 && x < 1.0) && (y>0.0 && y < 1.0))
            {
                System.out.println("true");
            }
            else
            {
                System.out.println("false");
            }
    } 

}
