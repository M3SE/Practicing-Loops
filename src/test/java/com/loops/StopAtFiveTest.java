package src.test.java.com.loops;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import src.main.java.com.loops.StopAtFive;

public class StopAtFiveTest {

    @Test
    public void testStopAtFive() {
        assertArrayEquals(new int[]{1, 2, 3, 4}, StopAtFive.stopAtFive(5));
        assertArrayEquals(new int[]{1, 2}, StopAtFive.stopAtFive(2));
        assertArrayEquals(new int[]{1, 2, 3, 4}, StopAtFive.stopAtFive(4));
        assertArrayEquals(new int[]{}, StopAtFive.stopAtFive(0));
        assertArrayEquals(new int[]{}, StopAtFive.stopAtFive(-5));
    }
}

