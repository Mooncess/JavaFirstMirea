package ru.mirea.task5.Solution_3;

public class TestFurniture {
    public static void main(String[] args) {
        FurnitureShop shop_1 = new FurnitureShop("Construction","Moscow");
        FurnitureShop shop_2 = new FurnitureShop("Super-repair", "Yekaterinburg");

        Sofa sofa = new Sofa(shop_1, 10000, "Green");
        Table table = new Table(shop_2, 7500, "Gray");

        System.out.println();

        System.out.println(rottweiler);
        System.out.println(greyhound);
        System.out.println(mastiff);
    }
}
