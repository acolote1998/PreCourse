package chapter11;

/*

Create an abstract class called Animal, which declares an
abstract method called makeSound() and implements a non abstract
method called eat();

Create a Pig class and a Duck class that both extend
the Animal class

Create a Farm class to test the implementations

 */

public class Farm {
    public static void main(String[] args) {
        Animal pig = new Pig();
        Animal duck = new Duck();

        pig.makeSound();
        pig.eat("pig");

        duck.makeSound();
        duck.eat("duck");
    }
}
