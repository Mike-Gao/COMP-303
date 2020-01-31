
import java.lang.reflect.Array;
import java.util.*;

/**
 * Represents the inventory of books in one bookstore
 */
public class Bookstore
{
    private Book lastBook; // Last Book
    /* Question 1: Modify BookStore Class so that it can Store a list of staff who work at a given BookStore */
    private ArrayList<Staff> listOfStaff;
    /* ===================================================================================================== */
    private final String aName; // Unique
    private final HashMap<Book, Integer> aInventory = new HashMap<>();

    /**
     * Creates a new bookstore with no books in it,
     * and identified uniquely with pName.
     * @param pName A unique identifier for the bookstore.
     */
    public Bookstore(String pName)
    {
        aName = pName;
    }

    /**
     * @return The unique name of the bookstore.
     */
    public String getName()
    {
        return aName;
    }

    public void assignStaff(ArrayList<Staff> s){
        if (listOfStaff.isEmpty()){
            listOfStaff = (ArrayList<Staff>) s.clone();
        }
        else {
            for (int i = 0; i < s.size(); i++){
                listOfStaff.add(s.get(i));
            }
        }
    }

    public void addBook (Book book){
        if (aInventory.containsKey(book)){
            int inventorySize = aInventory.get(book);
            aInventory.replace(book,inventorySize++);
        } else {
            aInventory.put(book,1);
        }
        lastBook = book;
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

    public Book getLastBook() {
        return lastBook;
    }

    public ArrayList<Book> sortedBooksbyPrice(){
        Set<Book> KeySet = aInventory.keySet();
        ArrayList<Book> bookSorted = new ArrayList<Book>(KeySet);
        Collections.sort(bookSorted, Book.createbyPriceComparator());
        return bookSorted;
    }

    public ArrayList<Book> sortedBooksbyTitle(){
        Set<Book> KeySet = aInventory.keySet();
        ArrayList<Book> bookSorted = new ArrayList<Book>(KeySet);
        Collections.sort(bookSorted, Book.createbyTitleComparator());
        return bookSorted;
    }



}
