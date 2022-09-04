package ru.mirea.task3.Solution_3;

public class Book {
    private String author;
    private String title;
    private int YearOfPublication;
    /*public Book(String author, String title, int YearOfPublication) {
        this.author = author;
        this.title = title;
        this.YearOfPublication = YearOfPublication;
    }*/
    public String getAuthor() {
        return author;
    }
    public String getTitle() {
        return title;
    }
    public int getYearOfPublication() {
        return YearOfPublication;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setYearOfPublication(int YearOfPublication) {
        this.YearOfPublication = YearOfPublication;
    }
}
