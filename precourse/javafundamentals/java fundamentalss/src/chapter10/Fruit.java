package chapter10;

/*

Create class called Fruit. Class should contain field called calories
and a method called makeJuice which prints a statement "Juice is made"

Create two subclasses of the Fruit class (Apple, Banana) and create
methods in these classes that are specific to them (removeSeeds, peel)

Set the calories within the constructors of these subclasses. Override the
makeJuice method to print the specific type of juice that's made.

Create a market class which tests polymorphism by creating several variations
of these objects

 */
public class Fruit {

    protected int calories;

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void makeJuice() {
        System.out.println("Juice is made");
    }

}
