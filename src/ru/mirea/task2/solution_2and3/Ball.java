package ru.mirea.task2.solution_2and3;

public class Ball {
    private String type;
    public Ball(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String toString() {
        return "Ball: " + getType();
    }
}
