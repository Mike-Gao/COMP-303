import java.util.ArrayList;
import java.util.Collections;

public class ShuffledPlay extends OrderedPlay {

    /*
     * Reinit to initial state
     * @param size, Size of the queue
     */
    public void reinit(int size){
        super.reinit(size);
        Collections.shuffle(al);
        it = al.iterator();
    }

}
