package ru.mirea.task5.solution_3;

public class Sofa extends Furniture{
    public Sofa(FurnitureShop shop, int price, String color) {
        super(shop, price, color);
    }

    public String toString() {
        return "Sofa [ Price: " + price + "; Color: " + color + " ]";
    }
}
