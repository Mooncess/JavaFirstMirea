package ru.mirea.task6.solution_1;

public class Test {
    public static void main(String[] args) {
        Human human_1 = new Human("Ryan Gosling");
        Planet planet_1 = new Planet("Jupiter");
        Planet planet_2 = new Planet("Venus");

        System.out.println("Human: " + human_1.getName());
        System.out.println("Planet 1: " + planet_1.getName());
        System.out.println("Planet 2: " + planet_2.getName());
    }
}
