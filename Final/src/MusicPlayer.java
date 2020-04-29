import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * A class representing a Music Player App.
 * It contains a pool of songs that allow the user to traverse and add to the queue to play.
 */

public class MusicPlayer implements Iterable<Song>{
    private Map<String, Song> aItems = new LinkedHashMap<>(); // Make sure a predictable iteration order.
    private Map<String, PlayList> PlayLists = new LinkedHashMap<>();

    private Queue aQueue = new Queue();
    enum playOrder { INORDER, RANDOM };
    playOrder p;

    MusicPlayer(){}

    /**
     * Add a single song to the music pool if a song with the same name is not already in the pool.
     * @param pItem the song to be added in the pool
     * @pre pItem !=null
     */
    public void addItem(Song pItem) {
        assert pItem != null;
        aItems.putIfAbsent(pItem.getName(), pItem);
    }

    /**
     * Add a single song to the queue if that song can be found in the music pool.
     * @param pItemName the name of the song
     * @pre pItemName !=null
     */
    public void addItemToQueue(String pItemName) {
        assert pItemName!= null;
        if (aItems.containsKey(pItemName))
            aQueue.add(aItems.get(pItemName));
    }

    /**
     * Obtain the number of songs in the queue
     * @return the number of songs in the queue
     */
    public int getQueueSize() {
        return aQueue.size();
    }

    // Question 2.1
    @Override
    public Iterator<Song> iterator() {
        return aItems.values().iterator();
    }

    public Song getSong(String s) throws Exception {
        if (aItems.containsKey(s)) {
            return aItems.get(s);
        } else {
            throw new Exception();
        }
    }

    // Question 2.2
    public void addItemToPlayList(String s, PlayListElem e){
        assert s != null && e != null;
        if ((PlayLists.containsKey(s))) {
            PlayLists.get(s).addItem(e);
        } else {
            PlayLists.put(s, new PlayList(s)).addItem(e);
        }
    }

    public PlayList getPlayList(String s) throws Exception {
        if (PlayLists.containsKey(s)) {
            return PlayLists.get(s);
        } else {
            throw new Exception();
        }
    }

    // Question 2.3
    public void addPlayListToQueue(String s) {
        assert s!= null;
        if (PlayLists.containsKey(s)) {
            for (PlayListElem e : PlayLists.get(s)) {
                if (e instanceof Song) {
                    addItemToQueue(e.getName());
                } else if (e instanceof PlayList) {
                    this.addPlayListToQueue(e.getName());
                }
            }
        }
    }

    // Question 3.2
    public void setPlayOrder(playOrder p) {
        this.p = p;
    }

    public void initPlayOrder() {
        OrderedPlay play;
        switch(p) {
            case RANDOM:
                play = new ShuffledPlay();
                play.reinit(aQueue.size());
            case INORDER:
                play = new OrderedPlay();
                play.reinit(aQueue.size());
        }
    }

}
