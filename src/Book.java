
abstract class Book {
    protected String isbn, title, author;
    protected int year;
    protected double price;

    public Book(String isbn, String title, int year, double price, String author) {
        this.isbn = isbn;
        this.title = title;
        this.year = year;
        this.price = price;
        this.author = author;
    }

    public boolean isOutdated(int maxAge, int currentYear) {
        return (currentYear - year) > maxAge;
    }

    public abstract boolean isAvailable(int quantity);
    public abstract double buy(int quantity, String email, String address);
}
