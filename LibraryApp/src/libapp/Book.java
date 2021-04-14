package libapp;

public class Book {
    private String isbn;
    private String title;
    private String genre;
    private String description;
    private String author;

    public Book(String isbn, String title, String genre, String description, String author) {
        this.isbn = isbn;
        this.title = title;
        this.genre = genre;
        this.description = description;
        this.author = author;
    }
}
