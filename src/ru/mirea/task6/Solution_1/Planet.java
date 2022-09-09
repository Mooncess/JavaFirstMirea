package ru.mirea.task6.Solution_1;

import ru.mirea.task6.Solution_1.Nameable;

class Planet implements Nameable {
   private String name;

    public Planet(String name) {
        this.name = name;
    }

   @Override
    public String getName() {
       return name;
   }
}
