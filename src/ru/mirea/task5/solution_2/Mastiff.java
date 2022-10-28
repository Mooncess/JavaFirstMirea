package ru.mirea.task5.solution_2;

public class Mastiff extends Dog {
    public Mastiff(String name, int age) {
        super(name, age);
    }

    public String toString() {
        return "Mastiff [ Name: " + name + "; Age: " + age + " ]";
    }
}