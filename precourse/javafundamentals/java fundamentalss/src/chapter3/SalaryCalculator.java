package chapter3;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String arg[]){
//If
// All salespeople get a payment of $1000 a week
// Salespeople who exceed 10 sales get an additional bonus of 250
        int baseSalary = 10000;
        int bonus = 250;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write how many sales you have performed last week.");
        int howManySales = scanner.nextInt();
        scanner.close();

        if (howManySales>=10){
            baseSalary=baseSalary+bonus;
        }

        System.out.println("Thank you. Calculating your salary.");
        System.out.println("Based on your sales, your expected salary is "+baseSalary+ " SEK.");

    }
}
