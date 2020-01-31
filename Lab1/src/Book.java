import java.util.Comparator;
import java.util.Objects;

/**
 * A Book Item:
 */
public class Book
{
    private final String aTitle;
    private final String aAuthor;
    private final BookType aType;
    private final int aPrice; // In cents: 100 = one dollar

    /**
     * Creates a new book item.
     * @param pTitle  The title of the book.
     * @param pAuthor The name of the author
     * @param pType   The category of the book
     * @param pPrice  The price of the item in cents
     */
    public Book(String pTitle, String pAuthor, BookType pType, int pPrice)
    {
        aTitle = pTitle;
        aAuthor = pAuthor;
        aType = pType;
        aPrice = pPrice;
    }

    /**
     * @return The title of the book
     */
    public String getTitle()
    {
        return aTitle;
    }

    /**
     * @return The name of the Author.
     */
    public String getAuthor()
    {
        return aAuthor;
    }

    /**
     * @return The category of the book
     */
    public BookType getType()
    {
        return aType;
    }

    /**
     * @return The price of the book in cents
     */
    public int getPrice()
    {
        return aPrice;
    }

    /* Added to make Book.java Immutable */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return aPrice == book.aPrice &&
                aTitle.equals(book.aTitle) &&
                aAuthor.equals(book.aAuthor) &&
                aType == book.aType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(aTitle, aAuthor, aType, aPrice);
    }

    public static Comparator<Book> createbyPriceComparator(){
        return new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return Integer.compare(o1.aPrice, o2.aPrice);
            }
        };
    }
    public static Comparator<Book> createbyTitleComparator(){
        return new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.aTitle.compareTo(o2.aTitle);
            }
        };
    }

}
