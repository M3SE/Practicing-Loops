package src.test.java.com.loops;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import src.main.java.com.loops.PositiveNumbers;

public class PositiveNumbersTest {

    @Test
    public void testIsPositive() {
        assertTrue(PositiveNumbers.isPositive(5));
        assertTrue(PositiveNumbers.isPositive(1));
        assertFalse(PositiveNumbers.isPositive(0));
        assertFalse(PositiveNumbers.isPositive(-5));
    }
}

