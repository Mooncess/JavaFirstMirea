package ru.mirea.task5.Solution_1;

public class Teapot extends Dish {
    public Teapot(String material, String color) {
        super(material, color);
    }

    public String toString() {
        return "Teapot [ Material: " + material + "; Color: " + color + " ]";
    }
}
