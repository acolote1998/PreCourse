package chapter12;

import java.sql.Array;
import java.util.*;

public class LoopingThroughCollections {
    public static void main(String[] args) {

    }

    public static void setDemo() {
        Set fruit = new HashSet();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.size());
        System.out.println(fruit);
    }

    public static void listDemo() {
        List fruit = new ArrayList();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.get(2));
        System.out.println(fruit.size());
        System.out.println(fruit);
    }

    public static void queueDemo() {
        Queue fruit = new LinkedList();

        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.size());
        System.out.println(fruit);
    }

    public static void mapDemo() {
        Map fruitCalories = new HashMap();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);
        fruitCalories.put("lemon", 17);

        System.out.println(fruitCalories.size());
    }

}
