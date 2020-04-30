import java.util.ArrayList;
import java.util.Collections;

public class ShuffledPlay extends OrderedPlay {

    /*
     * Reinit to initial state
     * @param size, Size of the queue
     */
    public void init(int size){
        super.init(size);
        Collections.shuffle(al);
        it = al.iterator();
    }

}
