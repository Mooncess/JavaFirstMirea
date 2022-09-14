package ru.mirea.task7.solution_2;

public class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString() {
        return ("MovablePoint [ X = " + x + "; Y = " + y + "; xSpeed = " + xSpeed + "; ySpeed = " + ySpeed + " ]");
    }

    @Override
    public void moveDown() {
        ySpeed -= 1;
    }

    @Override
    public void moveLeft() {
        xSpeed -= 1;
    }

    @Override
    public void moveRight() {
        xSpeed += 1;
    }

    @Override
    public void moveUp() {
        ySpeed += 1;
    }
}
