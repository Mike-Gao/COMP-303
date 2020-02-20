import java.util.ArrayList;
import java.util.List;

/**
 * Represents a staff member working in a bookstore
 */
public class Staff {

    final private String aName;
    private Bookstore aStore;
    private List<Book> aBookRecommendation;

    /**
     * Creates a new staff with an unique name,
     * associated with one bookstore.
     * @param pName A unique identifier for the staff.
     * @param pStore  The bookstore the staff current works at.
     */
    public Staff(String pName, Bookstore pStore) {
        aName = pName;
        aStore = pStore;
        aBookRecommendation = new ArrayList<>();
    }

//    public Staff(String pName, Bookstore pStore, Book recommendation) {
//        aName = pName;
//        aStore = pStore;
//        aBookRecommendation = new ArrayList<>();
//        if (recommendation == null){
//            throw new IllegalArgumentException();
//        } else {
//            aBookRecommendation.add(recommendation);
//        }
//
//    }

    /**
     * Change the staff to a different bookstore
     * @param pStore The new bookstore at which the staff will work
     */
    public void changeBookstore(Bookstore pStore)
    {
        aStore = pStore;
    }
//    Use assert when private
//    private void changeBookstore(Bookstore pStore)
//    {
//        assert pStore != null;
//        aStore = pStore;
//    }

    public void addBookRecommendation(Book b){
        if (b == null) throw new IllegalArgumentException("The argument cannot be null");
        aBookRecommendation.add(b);
    }


}