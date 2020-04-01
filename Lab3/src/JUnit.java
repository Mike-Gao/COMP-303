import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JUnit {
    private static final Book BOOK1= new Book("The Time Machine", "H. G. Wells", BookType.FICTION, 500);
    HardCover h;

    public JUnit() {
        h = new HardCover(BOOK1);
    }

    @Test
    public void testBookPrice() {
        assertEquals(1000, h.getPrice());
    }
}