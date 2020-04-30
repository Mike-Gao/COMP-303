import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class ShuffledPlayTest {



    @Test
    public void shuffledPlayTest() {
        AbstractPlay test = new ShuffledPlay();
        test.init(1);
        assertNotNull(test.getNext());
        // Make Sure that it throws NoSuchElementException
        Assertions.assertThrows(NoSuchElementException.class, () -> {
            test.getNext();
        });
    }

    @Test
    public void testWithSameSize() {
        AbstractPlay test = new ShuffledPlay();
        test.init(1);
        test.getNext();
        test.init(1);
        assertTrue(test.hasNext());
    }

    @Test
    public void testInitHigherSize() {
        AbstractPlay test = new ShuffledPlay();
        test.init(1);
        test.getNext();
        test.init(2);
        test.getNext();
        assertTrue(test.hasNext());
        test.getNext();
        assertFalse(test.hasNext());
    }

    @Test
    public void testInitLowerSize() {
        AbstractPlay test = new ShuffledPlay();
        test.init(2);
        test.init(0);
        assertFalse(test.hasNext());
    }

    @Test
    public void testEmpty() {
        AbstractPlay test = new ShuffledPlay();
        test.init(0);
        assertFalse(test.hasNext());
    }

}
