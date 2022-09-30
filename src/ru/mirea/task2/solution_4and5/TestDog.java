package ru.mirea.task2.solution_4and5;

import java.util.Scanner;
import java.util.Vector;

public class TestDog {
    public static void main(String[] args) {
        int size;
        System.out.print("How many dogs do you want to add to the array: ");
        Scanner input = new Scanner(System.in);
        size = input.nextInt();
        Vector<Dog> arr = new Vector<>(0);

        String str = input.nextLine();

        System.out.println("[ Enter the name and age of the dog separated by a space ]");
        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + ") ");
            str = input.nextLine();
            String[] strStrings = str.split(" ");
            String name = strStrings[0];
            int age = Integer.parseInt(strStrings[1]);
            arr.addElement(new Dog(name, age));
        }

        System.out.println("\n{ Conclusion }\n\t\tName\tAge");
        for (Dog i : arr) {
            System.out.print(i.toString());
            System.out.println();
        }
    }
}
