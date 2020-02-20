import java.util.ArrayList;
import java.util.Random;

/**
 * Utility class with a driver program and some 
 * sample books, stores, and staffs.
 */
public final class Driver
{

    private static final Book BOOK1= Book.get("The Time Machine", "H. G. Wells", BookType.FICTION, 500);
    private static final Book BOOK2 = Book.get("Introduction to Software Design with Java", "Martin P. Robillard", BookType.TEXTBOOK, 3999);
    private static final Book BOOK3 = Book.get("The Moomins and the Great Flood", "Tove Jansson", BookType.COMIC, 1695);
//    private static final Book BOOK4 = new Book("Secret Book", "Jin Guo", BookType.COMIC);
    private static final Book BOOK5 = Book.get("The Moomins and the Great Flood", "Tove Jansson", BookType.COMIC, 1695);

    private static final Book[] Books = { BOOK1, BOOK3, BOOK5 };
    private Driver() {}

    /**
     * @param pArgs Not used
     */
    public static void main(String[] pArgs)
    {
        // Testing Singleton
        Bookstore bookstore1 = Bookstore.getInstance();
        Bookstore bookstore2 = Bookstore.getInstance();
        System.out.println((bookstore1 == bookstore2) ? true : false);
        bookstore1.init("The World");
        // Testing Flyweight
        // Compare Book if Title is the Same
        System.out.println(BOOK3 == BOOK5);
        System.out.println(BOOK3.equals(BOOK5));
        // Demonstrate Ascending Order by Price
        bookstore1.addBooks(Books);
        ArrayList<Book> b1 = bookstore1.sortedBooksbyPrice();
        for (int i = 0; i < b1.size(); i++){
            System.out.println(b1.get(i).getTitle());
            System.out.println(b1.get(i).getPrice());
        }
    }
}