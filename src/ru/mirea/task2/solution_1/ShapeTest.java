package ru.mirea.task2.solution_1;

public class ShapeTest {
    public static void main(String[] args) {
        Shape sh1 = new Shape("Sphere");
        System.out.println(sh1.toString());
        sh1.setShapeName("Cone");
        System.out.println(sh1.toString());

        Shape sh2 = new Shape("Cube");
        System.out.println(sh2.toString());
    }
}
