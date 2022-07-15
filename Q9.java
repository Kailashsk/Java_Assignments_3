import java.util.Scanner;

public class diss1{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the x and y coordinates of the point");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        if (x>0 && y>0)
        {
            System.out.println("The point is in first quadrant.");
        }
        else if (x<0 && y>0)
        {
            System.out.println("The point is in second quadrant");
        }
        else if (x < 0 && y < 0)
        {
            System.out.println("The point is in third quadrant.");
        }
        else if (x > 0 && y < 0)
        {
            System.out.println("The point is in fourth quadrant.");
        }
        else if (y==0)
        {
            System.out.println("The point is in x axis.");
        }
        else
        {
            System.out.println("The point is in y axis.");
        }
    } 

}
