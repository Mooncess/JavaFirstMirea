package ru.mirea.task8;

import java.util.Scanner;

public class Ex14 {

    public static void rec(int x) {
        if (x/10 > 0) {
            rec(x/10);
        }
        Scanner in = new Scanner(System.in);
        System.out.print(x%10 + " ");
        return;
    }


    public static void main(String[] args){
        System.out.println("[Program 8. Рекурсия]");
        System.out.print("Введите число: ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.print("Цифры введенного числа: ");
        rec(x);
    }
}
