package chapter12;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {

        List fruit = new ArrayList();

        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("apple");

        System.out.println(fruit.get(2)); // banana
        System.out.println(fruit.size());//4
        System.out.println(fruit);// prints all the elements of the list
    }
}
