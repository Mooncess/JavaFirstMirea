package ru.mirea.task7.solution_1;

public class Square extends Rectangle {
    public Square() {
    }
    public Square(double side) {
        this.width = side;
    }
    public Square(double side, String color, boolean filled) {
        this.width = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        this.width = side;
    }

    @Override
    public void setLength(double side) {
        this.width = side;
    }
    @Override
    public void setWidth(double side) {
        this.width = side;
    }
    @Override
    public String toString() {
        return ("Square [ Side = " + width + "; Color: " + color + "Filled: " + filled + " ]");
    }
}
