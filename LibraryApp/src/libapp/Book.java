package libapp;

public class Book {
    private String isbn;
    private String title;
    private String genre;
    private String description;
    private String author;
    private int quantity;
    private int numCheckedOut;

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getDescription() {
        return description;
    }

    public String getAuthor() {
        return author;
    }

    public Book(String isbn, String title, String genre, String description, String author) {
        this.isbn = isbn;
        this.title = title;
        this.genre = genre;
        this.description = description;
        this.author = author;
    }

}
