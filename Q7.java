import java.util.Scanner;

public class diss1{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input x and y coordinates of the first point:");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.println("Input x and y coordinates of the second point:");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        System.out.println("Input x and y coordinates of the third point:");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();
        double m12 = (y2 - y1) / (x2 - x1);
        double m23 = (y3 - y2) / (x3 - x2);
        if (m12 == m23)
        {
            System.out.println("The 3 points are collinear");
        }
        else
        {
            System.out.println("The 3 points are not collinear");
        }
    } 

}
