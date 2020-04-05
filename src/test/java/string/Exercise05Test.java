package string;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Exercise05Test {
    @Test
    public void test_() {
        assertEquals(new Exercise05().findSubStringRepeat(
                "Let  is    implement the first solution Let is go first   "
        ), Arrays.asList("Let", "is", "first"));
    }
}
