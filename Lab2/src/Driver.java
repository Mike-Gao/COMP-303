import java.util.Random;

/**
 * Utility class with a driver program and some 
 * sample books, stores, and staffs.
 */
public final class Driver
{

    private static final Book BOOK1= new Book("The Time Machine", "H. G. Wells", BookType.FICTION, 500);
    private static final Book BOOK2 = new Book("Introduction to Software Design with Java", "Martin P. Robillard", BookType.TEXTBOOK, 3999);
    private static final Book BOOK3 = new Book("The Moomins and the Great Flood", "Tove Jansson", BookType.COMIC, 1695);

    private static final Book[] Books = { BOOK1, BOOK2, BOOK3 };

    private Driver() {}

    /**
     * @param pArgs Not used
     */
    public static void main(String[] pArgs)
    {
        Bookstore bookstore1 = new Bookstore("Paragraph");
        Bookstore bookstore2 = new Bookstore("The Word");
    }
}