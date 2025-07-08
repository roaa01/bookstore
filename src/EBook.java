class EBook extends Book {
    private String filetype;

    public EBook(String isbn, String title, int year, double price, String author, String filetype) {
        super(isbn, title, year, price, author);
        this.filetype = filetype;
    }

    public boolean isAvailable(int quantity) {
        return true;
    }

    public double buy(int quantity, String email, String address) {
        System.out.println("Quantum book store: Sending " + quantity + " x " + title + "." + filetype + " to " + email);
        return price * quantity;
    }
}

