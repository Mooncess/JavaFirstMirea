package ru.mirea.task1;

import java.util.Random;

public class Solution_6 {
    public static void main(String[] args) {
        System.out.println("[Program 4]");
        System.out.println("{ Using the method - random() }");
        int[] arr = new int[5 + (int) (Math.random() * 10)];
        System.out.print("Generated array: [");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
        //Sorting
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr.length - 1; j++)
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

        System.out.print("Sorted array: [ ");
        for (int j : arr) System.out.print(j + " ");
        System.out.println("]");

        System.out.println("\n{ Using the class - Random }");
        System.out.print("Generated array: [");
        Random random = new Random(); //Способ генерации чисел через класс Random
        int[] arr_2 = new int[5 + random.nextInt(10)];
        for (int i = 0; i < arr_2.length; i++) {
            arr_2[i] = random.nextInt(100);
            System.out.print(arr_2[i] + " ");
        }
        System.out.println("]");
        //Sorting
        for (int i = 0; i < arr_2.length; i++)
            for (int j = 0; j < arr_2.length - 1; j++)
                if (arr_2[i] < arr_2[j]) {
                    int temp = arr_2[i];
                    arr_2[i] = arr_2[j];
                    arr_2[j] = temp;
                }

        System.out.print("Sorted array: [ ");
        for (int j : arr_2) System.out.print(j + " ");
        System.out.println("]");
    }
}
