package ru.mirea.task5.Solution_1;

public class Glass extends Dish {
    public Glass(String material, String color) {
        super(material, color);
    }

    public String toString() {
        return "Glass [ Material: " + material + "; Color: " + color + " ]";
    }
}
