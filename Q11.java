import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class diss1{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of the person");
        double h=sc.nextDouble();
        System.out.println("Enter the weight of the person");
        double w=sc.nextDouble();
        double bmi=(w)/(h*h);
        if(bmi<18.5)
        {
            System.out.println("underweight");
        }
        else if(bmi>=18.5 && bmi<= 24.9)
        {
            System.out.println("normal weight");
        }
        else if(bmi>=25.0 && bmi<=29.9)
        {
            System.out.println("overweight");
        }
        else
        {
            System.out.println("obese");
        }
    } 

}
