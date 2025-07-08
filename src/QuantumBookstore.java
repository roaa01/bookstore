// QuantumBookstore.java
import java.util.*;
import java.time.Year;

class QuantumBookstore {
    private Map<String, Book> inventory = new HashMap<>();

    public void addBook(Book book) {
        inventory.put(book.isbn, book);
        System.out.println("Quantum book store: Added book - " + book.title);
    }

    public List<Book> removeOutdatedBooks(int maxAge) {
        int currentYear = Year.now().getValue();
        List<Book> removedBooks = new ArrayList<>();

        Iterator<Map.Entry<String, Book>> it = inventory.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Book> entry = it.next();
            if (entry.getValue().isOutdated(maxAge, currentYear)) {
                removedBooks.add(entry.getValue());
                System.out.println("Quantum book store: Removed outdated book - " + entry.getValue().title);
                it.remove();
            }
        }
        return removedBooks;
    }

    public double buyBook(String isbn, int quantity, String email, String address) {
        Book book = inventory.get(isbn);
        if (book == null) throw new RuntimeException("Quantum book store: Book not found");
        if (!book.isAvailable(quantity)) throw new RuntimeException("Quantum book store: Not available in requested quantity");
        double totalPaid = book.buy(quantity, email, address);
        System.out.println("Quantum book store: Purchase complete. Paid $" + totalPaid);
        return totalPaid;
    }
}
