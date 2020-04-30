import java.util.ArrayList;

public class OrderedPlay extends AbstractPlay {

    /*
    * Reinit to initial state
    * @param size, Size of the queue
     */
    public void init(int size){
        super.init(size);
        it = al.iterator();
    }
}
