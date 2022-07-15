import java.util.Scanner;

public class diss1{

    public static void main(String[] args) {
        System.out.println("Input the 1st integer:");
            int n1 = Integer.parseInt(args[0]);
            System.out.println("Input the 2nd integer:");
            int n2 = Integer.parseInt(args[1]);
            System.out.println("Input the 3rd integer:");
            int n3 = Integer.parseInt(args[2]);
            if ((n1==n2)&&(n2==n3)&&(n3==n1)){
                System.out.println("Equal");
            }
            else {
                System.out.println("Not equal");
            }   
    } 

}
