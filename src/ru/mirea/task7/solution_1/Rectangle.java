package ru.mirea.task7.solution_1;

public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle() {
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return (length*width);
    }
    @Override
    public double getPerimeter() {
        return ((2*length)+(2*width));
    }
    @Override
    public String toString() {
        return ("Rectangle [ Width = " + width + "; Length = " + length + "; Color: " + color + "Filled: " + filled + " ]");
    }
}
