package ru.mirea.task3.solution_2;

public class Human {
    private String name;
    private Leg legs = new Leg();
    private Head head = new Head();
    private Hand hands = new Hand();

    public Human(String name) {
        this.name = name;
        head.setHealth(((double) (Math.random() * 10000)) / 100);
        legs.setHealth(((double) (Math.random() * 10000)) / 100);
        hands.setHealth(((double) (Math.random() * 10000)) / 100);
    }

    public String getName() {
        return name;
    }

    public void outputHealth() {
        System.out.printf("Hands health: %.2f %%\nLegs health: %.2f %%\nHead health: %.2f %%", hands.getHealth(), legs.getHealth(), head.getHealth());
    }
}
