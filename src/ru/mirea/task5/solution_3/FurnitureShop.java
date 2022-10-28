package ru.mirea.task5.solution_3;

public class FurnitureShop {
    protected String city;
    protected String title;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String city) {
        this.title = title;
    }

    public FurnitureShop(String title, String city) {
        this.title = title;
        this.city = city;
    }

    public String toString() {
        return "Shop { Title: " + title + "; City: " + city + " }";
    }
}
