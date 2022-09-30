package ru.mirea.task1;

public class ForOutput {
    public static void main(String[] args) {
        System.out.println("[Program 3]");
        for (int i = 1; i < 11; i++) {
            double a = 1.0 / i;
            System.out.printf("%.2f\n", a);
        }
    }
}