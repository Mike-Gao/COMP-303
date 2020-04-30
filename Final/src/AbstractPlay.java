import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class AbstractPlay implements PlayOrder{

    protected Iterator<Integer> it = Collections.emptyIterator();
    protected ArrayList<Integer> al = new ArrayList<>();
    @Override
    public int getNext() {
        return it.next();
    }

    @Override
    public boolean hasNext() {
        return it.hasNext();
    }

    @Override
    public void init(int size) {
        for (int i = 0; i < size; i++) {
            al.add(i);
        }
    }
}
