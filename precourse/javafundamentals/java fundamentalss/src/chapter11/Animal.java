package chapter11;

/*

Create an abstract class called Animal, which declares an
abstract method called makeSound() and implements a non abstract
method called eat();

Create a Pig class and a Duck class that both extend
the Animal class

Create a Farm class to test the implementations

 */

public abstract class Animal {

    abstract public void makeSound();

    public void eat(String animal) {
        System.out.println("The " + animal + " is eating. Animal class");
    }


}
