package libapp;

public class Main {
    public static void main(String[] args) {
        LibraryApp app = new LibraryApp();
        app.searchByIsbn("68254");
        app.searchByIsbn("12581");
        app.searchByTitle("Baseball");


    }
}
