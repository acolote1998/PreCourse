package chapter9;

/*

Create a superclass called Cake that has two fields:
Flavor and Price
Getter and setter methods should be created for these fields

Create a BirthdayCake class which inherits from Cake and has a field
called candles. Include getter and setter method

Create a WeddingCake class which inherits from Cake and has a field called
tiers. Include getter and setter method

Create a TasteTester class to test our your inheritance

 */
public class BirthdayCake extends Cake {
    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }

    protected int candles;
}
