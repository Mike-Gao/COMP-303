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
        Song SONG5 = new Song("WALK", "Radwimps", 232);
        MusicPlayer m = new MusicPlayer();
        m.addItem(SONG1);
        m.addItem(SONG2);
        m.addItem(SONG3);
        m.addItem(SONG4);
        m.addItem(SONG5);

        // Question 2.1
        System.out.println("=================");
        System.out.println("Testing for Q2.1");
        for (Song s : m){
            System.out.println(s.getName());
        }
        System.out.println("=================");
        // Question 2.2
        System.out.println("Testing for Q2.2");
        // Create Playlist while at the same time adding a song
        m.addItemToPlayList("Mike", m.getSong("Swear It Again"));
        // Confirm that same song can be added again
        m.addItemToPlayList("Mike", m.getSong("Swear It Again"));
        // Testing Removal
        m.getPlayList("Mike").removeItem(m.getSong("Swear It Again"));
        m.addItemToPlayList("Mike", m.getSong("If I Let You Go"));

        // Create a new Playlist
        m.addItemToPlayList("Jin", m.getSong("I Want It That Way"));
        // Confirm can add PlayList
        m.addItemToPlayList("Jin", m.getPlayList("Mike"));
        m.addItemToPlayList("Jin", m.getSong("As Long As You Love Me"));

        m.addItemToPlayList("Kevin", m.getSong("If I Let You Go"));
        m.addItemToPlayList("Kevin", m.getSong("Swear It Again"));
        m.addItemToPlayList("Kevin", m.getPlayList("Mike"));
        // Test Remove
        m.getPlayList("Kevin").removeItem(m.getPlayList("Mike"));
        m.viewPlayList();
        System.out.println("=================");

        // Question 2.3 & Question 3.1
        m.setPlayOrder(new OrderedPlay());
        System.out.println("Testing for Q2.3 & Q3.1 OrderedPlay ");
        m.addItemToQueue("As Long As You Love Me");
        m.addPlayListToQueue("Kevin");
        // View queue to confirm everything is added and the order is preserved at the same time.
        m.play();
        m.play();
        m.play();
        m.play();
        System.out.println("=================");

        // Question 3.2
        System.out.println("Testing for Q3.2 + Shuffled Play");
        m.setPlayOrder(new ShuffledPlay());
        // View Queue to confirm everything is added and the order is preserved at the same time.
        m.play();
        m.play();
        m.play();
        m.play();
        System.out.println("=================");

        // Question 3.4
        System.out.println("Testing for Q3.4 + Shuffled Play");
        m.addItemToQueue("WALK");
        System.out.println("View and Check the Queue Here");
        m.play();
        m.play();
        m.play();
        m.play();
        m.play();
        System.out.println("=================");

        // Question 4.1
        System.out.println("Testing for Q4.1 + Ordered Play");
        m.setPlayOrder(new OrderedPlay());
        Controller remote = new RemoteController(m);
        remote.next();
        Controller voice = new VoiceController(m);
        voice.next();
    }
}
