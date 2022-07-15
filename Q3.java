import java.util.Scanner;

public class diss1{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the integer:");
        int n = sc.nextInt();
        if (n%2==0){
            System.out.println("Number is even.");
        }
        else {
            System.out.println("Number is odd.");
        }
    } 

}
