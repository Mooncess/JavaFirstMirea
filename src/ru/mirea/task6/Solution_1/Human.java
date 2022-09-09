package ru.mirea.task6.Solution_1;

public class Human implements Nameable {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
