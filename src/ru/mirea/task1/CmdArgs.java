package ru.mirea.task1;

public class CmdArgs {
    public static void main(String[] args) {
        System.out.println("[Program 2]");
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + ": " + args[i]);
        }
    }
}
