package ru.mirea.task3.Solution_3;

import ru.mirea.task3.Solution_2.Human;

public class BookTest {
    public static void main(String[]args)
    {
        Book book = new Book();
        book.setAuthor("Garcia arquez");
        book.setTitle("10 years of solitude");
        book.setYearOfPublication(1960);

        System.out.print("Title\t\t\t\t\tAuthor\t\tYearOfPublication\n");
        System.out.print(book.getTitle() + "\t" + book.getAuthor() + "\t" + book.getYearOfPublication() + "\n\n");

        System.out.println("It seems the data is incorrect. We need to fix them!\n");

        book.setAuthor("Garcia Marquez");
        book.setTitle("100 years of solitude");
        book.setYearOfPublication(1967);
        System.out.print("Title\t\t\t\t\tAuthor\t\tYearOfPublication\n");
        System.out.print(book.getTitle() + "\t" + book.getAuthor() + "\t" + book.getYearOfPublication() + "\n\n");

        System.out.println("That's better!");
    }
}
