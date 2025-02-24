package chapter12;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        Map fruitCalories = new HashMap();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 10);
        fruitCalories.put("banana", 105);
        fruitCalories.put("lemon", 50);
        fruitCalories.putIfAbsent("kiwi", 35);

        System.out.println(fruitCalories.size());
        System.out.println(fruitCalories);

        System.out.println(fruitCalories.get("lemon"));

        System.out.println(fruitCalories.entrySet());

        fruitCalories.remove("lemon");

        System.out.println(fruitCalories);
    }
}
