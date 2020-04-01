
import java.util.HashMap;
import java.util.Iterator;

/**
 * Represents the inventory of books in one bookstore
 */
public class Bookstore
{
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

    public HashMap addBook (Book book){
        if (aInventory.containsKey(book)){
            int inventorySize = aInventory.get(book);
            aInventory.replace(book,inventorySize++);
            return aInventory;
        } else {
            aInventory.put(book,1);
            return aInventory;
        }
    }



}
