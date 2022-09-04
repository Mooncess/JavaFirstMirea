package ru.mirea.task3.Solution_1;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(16, 10, 1);
        System.out.println("Default center coordinates: X = " + circle.getX0() + ", Y = " + circle.getY0());
        System.out.println("Default radius value: " + circle.getR());

        circle.setX0(1007.56);
        circle.setY0(-150);
        circle.setR(200.55);

        System.out.println("New coordinates of the center: X = " + circle.getX0() + ", Y = " + circle.getY0());
        System.out.println("New radius value: " + circle.getR());
    }
}
