package ru.mirea.task8;

import java.util.Scanner;

public class Ex13 {
    public static void rec() {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (x != 0) {
            System.out.println(x);
            int a = in.nextInt();
            if(a == 0) {
                return;
            }
            rec();
        }
    }


    public static void main(String[] args){
        System.out.println("[Program 8. Рекурсия]");
        rec();
    }
}
