package string;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Exercise03Test {
    @Test
    public void test_sumNumOfString() {
        assertEquals(new Exercise03().sumNumOfString("abc 123 def 33 mn 3.221"), 380);
        assertEquals(new Exercise03().sumNumOfString("123 def 33 mn 3 -- 222"), 381);
    }
}
