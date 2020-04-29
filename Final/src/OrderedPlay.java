import java.util.Map;

public class OrderedPlay implements PlayOrder {

    private Queue<Song> orderedQueue;
    private Map<Integer, Song> orderedMap;

    public OrderedPlay(Queue q, Map<Integer, Song> m) {
        orderedQueue  = q;
        orderedMap = m;
    }

    @Override
    public int getNext() {
        return 0;
    }

    @Override
    public boolean hasNext() {
        return false;
    }
}
