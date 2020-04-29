import java.util.ArrayList;
import java.util.Iterator;

public class PlayList implements PlayListElem, Iterable<PlayListElem> {

    private final String aName;
    private final ArrayList<PlayListElem> elements = new ArrayList<>();

    public PlayList(String s) {
        assert s != null;
        aName = s;
    }

    public void addItem(PlayListElem e) {
        assert e != null;
        elements.add(e);
    }

    public void removeItem(PlayListElem e) {
        assert e != null;
        elements.remove(e);
    }

    @Override
    public String getName() {
        return aName;
    }

    @Override
    public Iterator<PlayListElem> iterator() {
        return elements.iterator();
    }
}
