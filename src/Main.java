
public class Main {
    public static void main(String[] args) {
        QuantumBookstore store = new QuantumBookstore();

        Book paperBook = new paperBook("001", "  Handmaid's tale", 1985, 50.0, "Margaret Atwood", 5);
        Book ebook = new EBook("002", "It ends with us ", 2020, 30.0, "Coline Hover", "pdf");
        Book showcaseBook = new ShowCaseBook("003", "Emma", 1815, "Jane Austen");

        store.addBook(paperBook);
        store.addBook(ebook);
        store.addBook(showcaseBook);

        store.buyBook("001", 2, "Roaahazem@gmail.com", "madint nasr");
        store.buyBook("002", 1, "Linaelatik@gmail.com", "-");

        store.removeOutdatedBooks(10);

        try {
            store.buyBook("003", 1, "menna@gmail.com", "masr elgdida");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
