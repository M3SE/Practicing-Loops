package src.test.java.com.loops;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import src.main.java.com.loops.TakeABreak;

public class TakeABreakTest {

    @Test
    public void testTakeABreak() {
        assertEquals("Break time!", TakeABreak.takeABreak("yes"));
        assertEquals("No break yet.", TakeABreak.takeABreak("no"));
        assertEquals("No break yet.", TakeABreak.takeABreak("maybe"));
        assertEquals("Break time!", TakeABreak.takeABreak("yes"));
    }
}
