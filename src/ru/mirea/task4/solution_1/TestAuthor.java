package ru.mirea.task4.solution_1;

public class TestAuthor {
    public static void main(String[]args) {
        Author author = new Author("Evan Wright", "evan@gmail.com", 'M');
        System.out.println("[ Initial data ]\n");
        System.out.println(author.toString());
        System.out.println("\n[ New data ]\n");
        author.setEmail("evanwright@gmail.com");
        System.out.println(author.toString());
    }
}
