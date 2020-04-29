import java.util.Collections;
import java.util.Iterator;

public class AbstractPlay implements PlayOrder{

    protected Iterator<Integer> it = Collections.emptyIterator();

    @Override
    public int getNext() {
        return it.next();
    }

    @Override
    public boolean hasNext() {
        return it.hasNext();
    }
}
