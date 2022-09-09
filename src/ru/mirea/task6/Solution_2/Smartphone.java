package ru.mirea.task6.Solution_2;

public class Smartphone implements Priceable {
    private int price;

    public Smartphone(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
