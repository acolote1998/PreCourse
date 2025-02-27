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
public class TasteTester {
    public static void main(String args[]) {
        //
        Cake cake = new Cake();
        cake.setFlavor("Chocolate");
        cake.setPrice(150);
        //
        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setFlavor("Orange");
        birthdayCake.setPrice(100);
        birthdayCake.setCandles(5);
        //
        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setFlavor("Vanilla");
        weddingCake.setPrice(850);
        weddingCake.setTiers("5");

        System.out.println("The regular cake is made of");
        System.out.println(cake.flavor + " and it costs " + cake.price);

        System.out.println("The birthday cake is made of");
        System.out.println(birthdayCake.flavor + " and it costs " + birthdayCake.price);
        System.out.println("It comes with " + birthdayCake.candles + " candles");

        System.out.println("The wedding cake is made of");
        System.out.println(weddingCake.flavor + " and it costs " + weddingCake.price);
        System.out.println("It is " + weddingCake.tiers + " tier");


    }

}
