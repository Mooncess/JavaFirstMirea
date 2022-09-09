package ru.mirea.task6.Solution_2;

public class Notebook implements Priceable {
    private int price;

    public Notebook(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
