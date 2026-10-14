public class Book {
    String title;
    String author;
    int publicationYear;

    public Book() {
        this("Unknown", "Unknown", 2026);
    }

    public Book(String title, String author) {
        this(title, author, 2026);
    }

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }
}
