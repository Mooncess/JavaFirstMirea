package ru.mirea.task2.Solution_1;

public class Shape {
    private String name;
    public Shape(String name) {
        this.name = name;
    }
    public String getShapeName() {
        return name;
    }
    public void setShapeName(String name) {
        this.name = name;
    }
    public String toString() {
        return "Figure: " + getShapeName();
    }
}
