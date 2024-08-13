package src.test.java.com.loops;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import src.main.java.com.loops.Multiplication;

public class MultiplicationTest {

    @Test
    public void testMultiply() {
        assertEquals(0, Multiplication.multiply(0, 5));
        assertEquals(25, Multiplication.multiply(5, 5));
        assertEquals(-15, Multiplication.multiply(3, -5));
        assertEquals(50, Multiplication.multiply(-10, -5));
    }
}

