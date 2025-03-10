package chapter4;

import java.util.Scanner;

public class CalculatePayByWeeklyHours {
    public static void main(String args[]){
        //Each store employee makes $15 an hour
        // Write a program that allows a manager to enter
        // The number of weekly hours worked for each employee
        // Calculate their pay
        // Do not allow overtime

        Scanner scanner = new Scanner(System.in);
        int hoursWorked;
        int hourlyWage=15;
        int maxHours=40;

        System.out.println("Please introduce the amount of hours the employee has worked");
        hoursWorked=scanner.nextInt();

        while(hoursWorked>maxHours){
            System.out.println("We do not allow overtime in this company, please enter a maximum hours of "+maxHours);
            System.out.println("Introduce the amount of hours again");
            hoursWorked = scanner.nextInt();
        }

        System.out.println("The calculated pay is "+(hourlyWage*hoursWorked)+" SEK");
    }
}
