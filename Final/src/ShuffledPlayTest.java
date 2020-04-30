import org.junit.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static sun.reflect.misc.FieldUtil.getDeclaredFields;
import static sun.reflect.misc.FieldUtil.getField;

public class ShuffledPlayTest {



    @Test
    public void shuffledPlayTest() {
        ArrayList<Integer> aList = new ArrayList<>();
        aList.add(0);
        aList.add(1);
        aList.add(2);
        assertNotNull(new ShuffledPlay());
        AbstractPlay test = new ShuffledPlay();
        test.init(5);
        assertNotNull(test.getNext());
    }
}
