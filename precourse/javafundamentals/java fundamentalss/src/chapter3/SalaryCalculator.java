package chapter3;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String arg[]){
//If
// All salespeople get a payment of $1000 a week
// Salespeople who exceed 10 sales get an additional bonus of 250
// The people who reached it, gets a congratulatory message, those who did not
// they are informed how many sales were missing
        int baseSalary = 10000;
        int bonus = 250;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write how many sales you have performed last week.");
        int howManySales = scanner.nextInt();
        scanner.close();

        System.out.println("Thank you. Calculating your salary.");

        if (howManySales>=10){
            baseSalary=baseSalary+bonus;
            System.out.println("Congratulations! Due to your performance, you have unlocked an extra bonus of "+bonus+" SEK.");
        }
        else {
            System.out.println("Sadly, you did not make enough sales for unlocking your bonus. You were "+(10-howManySales)+" sale/s away.");
        }


        System.out.println("Based on your sales, your expected salary is "+baseSalary+ " SEK.");

    }
}
