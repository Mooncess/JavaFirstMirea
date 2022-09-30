package ru.mirea.task1;

public class Cycles {
    public static void main(String[] args) {
        System.out.println("[Program 1]");

        int[] myArray = {5, 45, 98, 8, 0, 1};

        int s = 0;

        System.out.print("[FOR] Sum of elements = ");
        for (int k : myArray) {
            s += k;
        }
        System.out.println(s);

        s = 0;

        System.out.print("[WHILE] Sum of elements = ");
        int j = 0;
        while (j < myArray.length) {
            s += myArray[j];
            j++;
        }
        System.out.println(s);

        s = 0;

        System.out.print("[DO WHILE] Sum of elements = ");
        j = 0;
        do {
            s += myArray[j];
            j++;
        } while (j < myArray.length);
        System.out.println(s);
    }
}
