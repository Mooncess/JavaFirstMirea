package ru.mirea.task5.solution_3;

public abstract class Furniture {
    protected int price;
    protected String color;
    protected FurnitureShop shop;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public FurnitureShop getShop() {
        return shop;
    }

    public void setShop(FurnitureShop shop) {
        this.shop = shop;
    }

    public Furniture(FurnitureShop shop, int price, String color) {
        this.shop = shop;
        this.price = price;
        this.color = color;
    }
}
