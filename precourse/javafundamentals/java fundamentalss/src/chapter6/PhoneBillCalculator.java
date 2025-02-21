package chapter6;

import java.util.Scanner;

public class PhoneBillCalculator {
    //Phone bill exercise
    //A phone bill should have an id, base cost, number of alloted minutes
    // number of minutes used. One should also be able to calculate the average,
    // tax and total on a phone bill, also be able to print an itemized bill.

    //Include the following constructors: default, id-only, all fields. No matter which
    // constructor is used, all fields should be set.
    // Create a class that instantiates a phone bill and prints the itemized bill

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello user, please create your phone plan now:");
        System.out.println("What is your ID:");
        int desiredId = scanner.nextInt();
        System.out.println("What are your alloted minutes:");
        int desiredAlotedMinutes = scanner.nextInt();
        System.out.println("What are your used minutes:");
        int desiredUsedMinutes = scanner.nextInt();

        PhoneBill phonebill = new PhoneBill(desiredId, desiredAlotedMinutes, desiredUsedMinutes);

        System.out.println("Perfect. This is the information we have for you:");

        System.out.println(phonebill.printBill());


    }

}
