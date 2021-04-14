package libapp;

import java.util.ArrayList;

public class LibraryApp {
    private BookRepository bookRepo = new BookRepository();

    public void searchByIsbn(String isbn){
        System.out.printf("Searching for books with ISBN %s.\n", isbn);
        Book book = bookRepo.findByIsbn(isbn);
        if (book != null){
            System.out.printf("1 book found: \n\tTitle: %s\n\tGenre: %s\n\tAuthor: %s", book.getTitle(), book.getGenre(),book.getAuthor());
        }
        else {
            System.out.printf("0 books found.");

        }
        System.out.println("\n\n");
    }
    public void searchByTitle(String keyword){
        System.out.printf("Searching for books with '%s in the title...\n",keyword);
        ArrayList<Book> books = bookRepo.findByTitle(keyword);
        System.out.printf("%s books found: \n", books.size());
        for (Book book : books){
            System.out.printf("1 book found: \n\tTitle: %s\n\tGenre: %s\n\tAuthor: %s\n\t--n", book.getTitle(), book.getGenre(),book.getAuthor());
        }
    }
}
