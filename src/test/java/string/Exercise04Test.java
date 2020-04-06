package string;

import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise04Test {
    @Test
    public void checkRepeatOneString() {
        assertFalse(new Exercise04().checkRepeatOneString("abcdabcabc"));
        assertTrue(new Exercise04().checkRepeatOneString("abcabcabc"));
        assertTrue(new Exercise04().checkRepeatOneString("eeeeeeeee"));
        assertTrue(new Exercise04().checkRepeatOneString("ee"));
        assertFalse(new Exercise04().checkRepeatOneString("e"));
        assertFalse(new Exercise04().checkRepeatOneString(""));
    }
}
