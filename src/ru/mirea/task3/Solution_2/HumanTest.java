package ru.mirea.task3.Solution_2;

public class HumanTest {
    public static void main(String[]args)
    {
        Human human=new Human("Evan Wright");
        System.out.println("[ Data about a person ]");
        System.out.println("Name: " + human.getName());
        human.outputHealth();
    }
}
