package ru.mirea.task5.Solution_2;

public class TestDog {
    public static void main(String[] args) {
        Rottweiler rottweiler = new Rottweiler("Bobik",5);
        Greyhound greyhound = new Greyhound("Sharik", 3);
        Mastiff mastiff = new Mastiff("Playful", 3);

        System.out.println(rottweiler);
        System.out.println(greyhound);
        System.out.println(mastiff);
    }
}
