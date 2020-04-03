package string;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Exercise06Test {
    @Test
    public void test_shortenString() {
        assertEquals(new Exercise06().shortenString("abcccceeeeeefd"), "abc4e6fd");
        assertEquals(new Exercise06().shortenString("aabbbbbbbbbbbbbcc"), "a2b13c2");
    }
}
