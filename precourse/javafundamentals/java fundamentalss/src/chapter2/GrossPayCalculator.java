package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String arg[]){

        //Get number of hours worked
        System.out.println("Enter the number of hours the employee worked");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        //Get the hourly pay rate
        System.out.println("Enter the employee's pay rate");
        double payRate = scanner.nextDouble();

        //Multiply hours and pay rate
        double grossPay = hours * payRate;
        System.out.println("The gross pay is "+ grossPay);

    }
}