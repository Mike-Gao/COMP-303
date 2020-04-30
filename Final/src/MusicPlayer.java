import java.util.*;

/**
 * A class representing a Music Player App.
 * It contains a pool of songs that allow the user to traverse and add to the queue to play.
 */

public class MusicPlayer implements Iterable<Song>, Controllable{
    private Map<String, Song> aItems = new LinkedHashMap<>(); // Make sure a predictable iteration order.
    private Map<String, PlayList> PlayLists = new LinkedHashMap<>();

    private Queue aQueue = new Queue();
    AbstractPlay playOrder = new OrderedPlay(); // default config

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
        if (aItems.containsKey(pItemName)){
            aQueue.add(aItems.get(pItemName));
            playOrder.init(getQueueSize());
        }

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
            PlayLists.put(s, new PlayList(s));
            PlayLists.get(s).addItem(e);
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
    public void setPlayOrder(AbstractPlay p) {
        playOrder = p;
        playOrder.init(getQueueSize());
    }

    // Question 3.3
    public void play() {
        if (playOrder.hasNext()) {
            Song cur = (Song) aQueue.get(playOrder.getNext());
            System.out.println("Currently Playing: " + cur.getName());
        } else {
            System.out.println("There is no more to be played.");
        }
    }


    public void viewPlayList() {
        for (String s : PlayLists.keySet()) {
            System.out.println("Playlist " + s + " Contains the following Song or Playlists");
            Iterator it = PlayLists.get(s).iterator();
            while(it.hasNext()) {
                PlayListElem elem = (PlayListElem) it.next();
                System.out.println(elem.getName());
            }
            System.out.println("-----------------");
        }
    }

}
