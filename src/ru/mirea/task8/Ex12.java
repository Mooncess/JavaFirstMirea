package ru.mirea.task8;

import java.util.Scanner;

public class Ex12 {

    public static void rec() {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (x == 0) {
            return;
        }

        if (x % 2 != 0) {
            System.out.println(x);
        }

        rec();
    }


    public static void main(String[] args){
        System.out.println("[Program 8. Рекурсия]");
        rec();
    }
}

