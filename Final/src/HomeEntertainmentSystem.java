import java.util.Map;

/**
 *
 * Class representing the client code of the MusicPlayer app.
 *
 */
public class HomeEntertainmentSystem {

    public static void main(String[] args) throws Exception {
        Song SONG1 = new Song("Swear It Again","Westlife", 246);
        Song SONG2 = new Song("If I Let You Go", "Westlife", 218);
        Song SONG3 = new Song("I Want It That Way", "Backstreet Boys", 219);
        Song SONG4 = new Song("As Long As You Love Me", "Backstreet Boys", 218);
        MusicPlayer m = new MusicPlayer();
        m.addItem(SONG1);
        m.addItem(SONG2);
        m.addItem(SONG3);
        m.addItem(SONG4);

        // Question 2.1
        System.out.println("Testing for Q2.1");
        for (Song s : m){
            System.out.println(s.getName());
        }

        // Question 2.2
        System.out.println("Testing for Q2.2");
        // Create Playlist while at the same time adding a song
        m.addItemToPlayList("Mike", m.getSong("Swear It Again"));
        // Confirm that same song can be added again
        m.addItemToPlayList("Mike", m.getSong("Swear It Again"));
        m.addItemToPlayList("Mike", m.getSong("If I Let You Go"));

        // Create a new Playlist
        m.addItemToPlayList("Jin", m.getSong("I Want It That Way"));
        m.addItemToPlayList("Jin", m.getSong("If I Let You Go"));
        m.addItemToPlayList("Jin", m.getSong("As Long As You Love Me"));
        m.viewPlayList();


        // Question 2.3
        System.out.println("Testing for Q2.3");
        m.addItemToQueue("Swear It Again");
        m.addPlayListToQueue("Mike");
        m.addPlayListToQueue("Jin");
        m.setPlayOrder(new OrderedPlay());
        // View Queue to confirm everything is added and the order is preserved at the same time.
        m.viewQueue();

        // Question 3.1
        System.out.println("Testing for Q3.1");
        System.out.println(m.play());

        // Question 3.2
        System.out.println("Testing for Q3.2");
        m.setPlayOrder(new ShuffledPlay());
        m.viewQueue();

        // Question 3.4
        System.out.println("Testing for Q3.4");
        m.addItemToQueue("If I Let You Go");
        m.viewQueue();


    }
}
