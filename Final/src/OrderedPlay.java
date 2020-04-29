import java.util.ArrayList;

public class OrderedPlay extends AbstractPlay {
    ArrayList<Integer> al = new ArrayList<>();
    /*
    * Reinit to initial state
    * @param size, Size of the queue
     */
    public void reinit(int size){
        for (int i = 0; i < size; i++) {
            al.add(i);
        }
        it = al.iterator();
    }
}
