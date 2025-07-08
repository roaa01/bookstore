class paperBook extends Book {
    private int stock;

    public paperBook(String isbn, String title, int year, double price, String author, int stock) {
        super(isbn, title, year, price, author);
        this.stock = stock;
    }

    public boolean isAvailable(int quantity) {
        return stock >= quantity;
    }

    public double buy(int quantity, String email, String address) {
        if (stock < quantity) throw new RuntimeException("Quantum book store: Not enough stock");
        stock -= quantity;
        System.out.println("Quantum book store: Shipping " + quantity + " x " + title + " to " + address);
        return price * quantity;
    }
}

