import java.util.HashMap;
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
        /* a. A book can be binded to obtain a hardcover book.
           The price of the hardcover book is twice that of the original book.
           Use the appropriate design pattern to implement this.
           The design must be in such a way to facilitate inclusions of new variants
           of the book in the future even without the access to the source code of Book. */
        System.out.println(BOOK1.getPrice());
        HardCover BOOK1H = new HardCover(BOOK1);
        System.out.println(BOOK1H.getPrice());
        bookstore1.addBook(BOOK1);
        HashMap a = bookstore1.addBook(BOOK2);
        a.remove(BOOK2);
        /* Create a new type called Inventory. Inventory has a method to count the number of items in the inventory called getCount().
           Make BookStore of type Inventory. Create a new type of Inventory called the BookStoreChain that is a collection of BookStores */
        Inventory BookStoreChain = new Inventory();
        BookStoreChain.add(bookstore1);
        System.out.println(BookStoreChain.getCount());
        /* Write a unit test to check whether the implemented method produces the expected result. */
        JUnit j = new JUnit();
        j.testBookPrice();
    }
}