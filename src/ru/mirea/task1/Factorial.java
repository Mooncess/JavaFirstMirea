package ru.mirea.task1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("[Program 5]");
        int a = -1;
        Scanner input = new Scanner(System.in);
        while (a <= 0) {
            System.out.print("Enter the number whose factorial you want to calculate: ");
            a = input.nextInt();
            if(a > 0)
                System.out.println("Factorial of a number " + a + ": " + factorial(a));
            else
                System.out.println("Error, the number must be greater than 0. Try again.");
        }
    }
    public static int factorial(int a) {
        int f = 1;
        while (a > 0) {
            f *= a;
            a--;
        }
        return f;
    }
}
