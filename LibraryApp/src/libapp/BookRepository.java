package libapp;

import java.util.ArrayList;

public class BookRepository {
    private ArrayList<Book> books = new ArrayList<>();

    public BookRepository(){
        books.add(new Book( "83471", "The Dead of Night", "Horror", null, "S.K. Eleton"));
        books.add(new Book( "12581", "Baseball for Kids", "Sports", null, "Adam C. MacKinnon"));
        books.add(new Book( "68254", "Stealing Home", "Politics", null, "Eric Nusbaum"));
        books.add(new Book( "41158", "Baseball Codes", "Sports", null, "Jason Turbow"));
        books.add(new Book( "25688", "Kids are Great", "Culture", null, "Megan MacKinnon"));
        books.add(new Book( "98952", "Learning to Code", "Technology", null, "Sticky McPickle"));
    }
    public Book findByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;

    }
    public ArrayList<Book> findByTitle(String keyword){
        ArrayList<Book> booksFound = new ArrayList<>();
        for (Book book: books){
            if (book.getTitle().contains(keyword)){
                booksFound.add(book);

            }
        }
        return booksFound;
    }
}
