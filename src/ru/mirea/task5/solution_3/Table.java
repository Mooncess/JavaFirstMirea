package ru.mirea.task5.Solution_3;

public class Table extends Furniture{
    public Table(FurnitureShop shop, int price, String color) {
        super(shop, price, color);
    }

    public String toString() {
        return "Table [ Price: " + price + "; Color: " + color + " ]";
    }
}
