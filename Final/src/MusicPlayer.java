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

    public Song getSong(String s) {
        return (aItems.containsKey(s)) ? aItems.get(s) : null;
    }

    // Question 2.2
    public void createPlayList(String s) {
        assert s != null;
        PlayLists.putIfAbsent(s, new PlayList(s));
    }

    public void addItemToPlayList(String s, PlayListElem e){

    }

    // Question 2.3
    public void addPlayListToQueue(String s) {

    }

    // Question 3.2
    public void setplayOrder(playOrder s){
        this.p = s;
    }
}
