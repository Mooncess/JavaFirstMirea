package ru.mirea.task4.solution_2;

public class Ball {
    private double x = 0.0;
    private double y = 0.0;

    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Ball() {
    }

    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }

    public void move(double xDisp, double yDisp) {
        x+=xDisp;
        y+=yDisp;
    }
    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return ("Ball: x = " + getX() + "\ty = : " + getY());
    }
}
