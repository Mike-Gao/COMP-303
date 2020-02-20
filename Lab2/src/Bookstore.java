
import java.util.*;

/**
 * Represents the inventory of books in one bookstore
 */
public class Bookstore
{
//    private final String aName; // Unique
    private String aName;
    private static final HashMap<Book, Integer> aInventory = new HashMap<>();
    private static final Bookstore INSTANCE = new Bookstore();


//    /**
//     * Creates a new bookstore with no books in it,
//     * and identified uniquely with pName.
//     * @param pName A unique identifier for the bookstore.
//     */
//    public Bookstore(String pName)
//    {
//        aName = pName;
//    }

    /*
        Implement a Singleton within the Bookstore
    */

    private Bookstore() {
    }

    public void init(String pName){
        aName = pName;
    }

    public static Bookstore getInstance(){
        return INSTANCE;
    }
//    private Bookstore(String pName)
//    {
//        aName = pName;
//    }
//
//    public static Bookstore getInstance(String pName){
//        return new Bookstore(pName);
//    }

    /**
     * @return The unique name of the bookstore.
     */
    public String getName()
    {
        return aName;
    }

    public void addBook (Book book){
        if (aInventory.containsKey(book)){
            int inventorySize = aInventory.get(book);
            aInventory.replace(book,inventorySize++);
        } else {
            aInventory.put(book,1);
        }
    }

    public void addBooks(Book [] bookArr){
        for (int i = 0; i < bookArr.length; i++){
            addBook(bookArr[i]);
        }
    }

    public void addBookList(ArrayList<Book> books){
        for (int i = 0; i < books.size(); i++){
            addBook(books.get(i));
        }
    }

    public ArrayList<Book> sortedBooksbyPrice(){
        Set<Book> KeySet = aInventory.keySet();
        ArrayList<Book> bookSorted = new ArrayList<Book>(KeySet);
        Collections.sort(bookSorted, Book.createbyPriceComparator());
        return bookSorted;
    }

    /* Override Equal for Bookstore */
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Bookstore bookstore = (Bookstore) o;
//        return aName.equals(bookstore.aName);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(aName);
//    }
}
