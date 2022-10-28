package ru.mirea.task5.solution_3;

public class TestFurniture {
    public static void main(String[] args) {
        FurnitureShop shop_1 = new FurnitureShop("Construction","Moscow");
        FurnitureShop shop_2 = new FurnitureShop("Super-repair", "Yekaterinburg");

        Sofa sofa = new Sofa(shop_1, 10000, "Green");
        Table table = new Table(shop_2, 7500, "Gray");

        System.out.println();

        System.out.println(sofa);
        System.out.println(table);
        System.out.println(shop_1);
        System.out.println(shop_2);
    }
}
