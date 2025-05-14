package Arraylist;

import java.util.*;

public class ArrarListDemo {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");

        System.out.println("Fruits List:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        fruits.remove("Mango");
        System.out.println("After removal: " + fruits);
    }
}

