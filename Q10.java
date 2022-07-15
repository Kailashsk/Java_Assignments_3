import java.util.Scanner;

public class diss1{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coefficients of the x square, x and constant term of the quadratic equation:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if (a>0)
        {
        double d = (b*b) - (4*a*c);
        if (d > 0)
        {
            double r1 = (-b+d)/(2*a);
            double r2 = (-b-d)/(2*a);
            System.out.println("The 2 real roots of the above quadratic equation are " + r1 + "&" + r2);
        }
        else if (d == 0)
        {
            double r1 = (-b)/(2*a);
            System.out.println("The real root of the above quadratic equation is " + r1);
        }
        else 
        {
            System.out.println("The equation does not have any real roots, i.e., it has imaginary roots.");
        }
        }
        else
        {
            System.out.println("The above equation is not a quadratic equation.");
        }
    } 

}
