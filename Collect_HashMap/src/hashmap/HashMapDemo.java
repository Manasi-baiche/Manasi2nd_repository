package hashmap;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(101, "Manasi");
        students.put(102, "Aarav");
        students.put(103, "Sara");

        System.out.println("Student HashMap:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        students.remove(102);
        System.out.println("After removal: " + students);
    }
}
