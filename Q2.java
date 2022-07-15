import java.util.Scanner;

public class diss1{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input mark of the student:");
        double mark = sc.nextDouble();
        if (mark >= 40){
            System.out.println("Congratulation! You have passed the exam.");
        }
        else {
            System.out.println("Sorry! You have failed the exam.");
        }
    } 

}
