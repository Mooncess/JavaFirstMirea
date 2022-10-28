package ru.mirea.task6.solution_1;

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
