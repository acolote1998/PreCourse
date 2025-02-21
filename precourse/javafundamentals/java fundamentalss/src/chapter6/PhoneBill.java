package chapter6;

public class PhoneBill {
    //Phone bill exercise
    //A phone bill should have an id, base cost, number of alloted minutes
    // number of minutes used. One should also be able to calculate the average,
    // tax and total on a phone bill, also be able to print an itemized bill.

    //Include the following constructors: default, id-only, all fields. No matter which
    // constructor is used, all fields should be set.
    // Create a class that instantiates a phone bill and prints the itemized bill

    int id;
    int allotedMinutes;
    int usedMinutes;

    PhoneBill(int id, int allotedMinutes, int usedMinutes) {
        this.id = id;
        this.allotedMinutes = allotedMinutes;
        this.usedMinutes = usedMinutes;
    }

    PhoneBill(int id) {
        this.id = id;
        allotedMinutes = 0;
        usedMinutes = 0;
    }

    PhoneBill() {
        id = 0;
        allotedMinutes = 0;
        usedMinutes = 0;
    }
}
