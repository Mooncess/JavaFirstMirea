package ru.mirea.task6.Solution_2;

public class Test {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(96000);
        Smartphone smartphone_1 = new Smartphone(25000);
        Smartphone smartphone_2 = new Smartphone(18000);

        System.out.println("Notebook's price: " + notebook.getPrice());
        System.out.println("Smartphone1's price: " + smartphone_1.getPrice());
        System.out.println("Smartphone2's price: " + smartphone_2.getPrice());
    }
}
