package string;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Exercise04Test {
    @Test
    public void checkRepeatOneString() {
        assertEquals(new Exercise04().checkRepeatOneString("abcdabcabc"), false);
        assertEquals(new Exercise04().checkRepeatOneString("abcabcabc"), true);
        assertEquals(new Exercise04().checkRepeatOneString("eeeeeeeee"), true);
        assertEquals(new Exercise04().checkRepeatOneString("ee"), true);
        assertEquals(new Exercise04().checkRepeatOneString("e"), false);
    }
}
