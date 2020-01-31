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
        this.aName = pName;
        this.aStore = pStore;
        this.aBookRecommendation = new ArrayList<>();
    }

    /* Q1b: Create a copy constructor for the Staff class. */
    Staff(Staff s){
        aName = s.aName;
        aStore = s.aStore;
        aBookRecommendation = s.aBookRecommendation;
    }
    /* ************************************************** */


    /**
     * Change the staff to a different bookstore
     * @param pStore The new bookstore at which the staff will work
     */
    public void changeBookstore(Bookstore pStore)
    {
        aStore = pStore;
    }

    public Book getRecommendation(){
        return aBookRecommendation.get(aBookRecommendation.size()-1);
    }

    public void setaBookRecommendation(){
         aBookRecommendation.add(aStore.getLastBook());
    }
}