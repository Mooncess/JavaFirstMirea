package ru.mirea.task1;

public class Solution_1 {
    public static void main(String[] args) {
        System.out.println("[Program 1]");

        int[] myArray = {5, 45, 98, 8, 0, 1};

        int s = 0;

        System.out.print("[FOR] Sum of elements = ");
        for (int i = 0; i < 5; i++) {
            s += myArray[i];
        }
        System.out.println(s);

        s = 0;

        System.out.print("[WHILE] Sum of elements = ");
        int j = 0;
        while (j < 5) {
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
        } while (j < 5);
        System.out.println(s);
    }
}
