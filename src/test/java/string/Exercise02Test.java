package string;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Exercise02Test {
    @Test
    public void test_checkReverse() {
        assertEquals(new Exercise02().checkReverse("abcdcba"), true);
        assertEquals(new Exercise02().checkReverse("abccba"), true);
        assertEquals(new Exercise02().checkReverse("abcdba"), false);
        assertEquals(new Exercise02().checkReverse(""), true);
    }
}
