package ru.mirea.task2.Solution_2and3;

public class Book {
    private String author;
    private String title;
    private int YearOfPublication;
    public Book(String author, String title, int YearOfPublication) {
        this.author = author;
        this.title = title;
        this.YearOfPublication = YearOfPublication;
    }
    public String getAuthor() {
        return author;
    }
    public String getTitle() {
        return title;
    }
    public int getYearOfPublication() {
        return YearOfPublication;
    }
    public String toString() {
        return "Book: " + getAuthor() + getTitle() + getYearOfPublication();
    }
}