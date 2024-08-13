package src.test.java.com.loops;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import src.main.java.com.loops.CountToEleven;


public class CountToElevenTest {

    @Test
    public void testCountToEleven() {
        assertEquals(11, CountToEleven.countToEleven(0));
        assertEquals(11, CountToEleven.countToEleven(5));
        assertEquals(11, CountToEleven.countToEleven(11));
        assertEquals(12, CountToEleven.countToEleven(12));
        assertEquals(15, CountToEleven.countToEleven(15));
    }
}