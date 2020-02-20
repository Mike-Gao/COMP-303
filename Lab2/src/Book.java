import java.util.*;

/**
 * A Book Item:
 */
public class Book
{
    private String aTitle;
    private String aAuthor;
    private BookType aType;
    private int aPrice; // In cents: 100 = one dollar
//    private final Optional<Integer> aPrice;
    /**
     * Creates a new book item.
     * @param pTitle  The title of the book.
     * @param pAuthor The name of the author
     * @param pType   The category of the book
     * @param pPrice  The price of the item in cents
     */
    private Book(String pTitle, String pAuthor, BookType pType, int pPrice)
    {
        aTitle = pTitle;
        aAuthor = pAuthor;
        aType = pType;
        aPrice = pPrice;
    }

    private static final ArrayList<Book> BOOKS = new ArrayList<Book>();
    public static Book get(String pTitle, String pAuthor, BookType pType, int pPrice){
        for(int i = 0; i < BOOKS.size(); i++){
            if (BOOKS.get(i).getTitle() == pTitle){
                return BOOKS.get(i);
            }
        }
        Book nBook = new Book(pTitle, pAuthor, pType, pPrice);
        BOOKS.add(nBook);
        return nBook;
    }



//    public Book(String pTitle, String pAuthor, BookType pType, int pPrice)
//    {
//        aTitle = pTitle;
//        aAuthor = pAuthor;
//        aType = pType;
//        aPrice = Optional.of(pPrice);
//    }
//
//    public Book(String pTitle, String pAuthor, BookType pType)
//    {
//        aTitle = pTitle;
//        aAuthor = pAuthor;
//        aType = pType;
//        aPrice = Optional.empty();
//    }

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
//    public Optional<Integer> getPrice()
//    {
//        return aPrice;
//    }


//    public boolean isComingSoon() {
//        if (this.aPrice.equals(Optional.empty())) return true;
//        else return false;
//    }

    /*
    Implement a way to check if two books are identical.
    We denote book A and B to be identical if and only if they have the same title.
    */

    public static Comparator<Book> createbyPriceComparator(){
        return new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return Integer.compare(o1.aPrice, o2.aPrice);
            }
        };
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return aTitle.equals(book.aTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aTitle);
    }
}
