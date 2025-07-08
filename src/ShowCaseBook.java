class ShowCaseBook extends Book {
    public ShowCaseBook(String isbn, String title, int year, String author) {
        super(isbn, title, year, 0.0, author);
    }

    public boolean isAvailable(int quantity) {
        return false;
    }

    public double buy(int quantity, String email, String address) {
        throw new RuntimeException("Demo books are not for sale");
    }
}




