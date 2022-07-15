import java.util.Scanner;

public class diss1{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the age of Rahul");
        int a = sc.nextInt();
        System.out.println("Input the age of Ayush");
        int b = sc.nextInt();
        System.out.println("Input the age of Ajay");
        int c = sc.nextInt();
        if ((a < b) && (a < c))
        {
            System.out.println("Rahul is the youngest among all.");
        }
        else if ((b < a) && (b < c))
        {
            System.out.println("Ayush is the smallest among all.");
        }
        else
        {
            System.out.println("Ajay is the smallest among all.");
        }
    } 

}
