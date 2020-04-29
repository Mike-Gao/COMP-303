import java.util.Map;

/**
 *
 * Class representing the client code of the MusicPlayer app.
 *
 */
public class HomeEntertainmentSystem {

    public static void main(String[] args) {
        Song SONG1 = new Song("Swear It Again","Westlife", 246);
        Song SONG2 = new Song("If I Let You Go", "Westlife", 218);
        Song SONG3 = new Song("I Want It That Way", "Backstreet Boys", 219);
        Song SONG4 = new Song("As Long As You Love Me", "Backstreet Boys", 218);
        MusicPlayer m = new MusicPlayer();
        m.addItem(SONG1);
        m.addItem(SONG2);
        m.addItem(SONG3);
        m.addItem(SONG4);
        Queue q = new Queue();

        // Question 2.1
        System.out.println("Testing for Q2.1");
        for (Song s : m){
            System.out.println(s.getName());
        }

        // Question 2.2
        m.addItemToQueue("Item");
        m.addPlayListToQueue("Playlist");

        // Question 2.3


    }
}
