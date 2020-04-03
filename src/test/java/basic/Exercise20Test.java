package basic;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Exercise20Test {
    @Test
    public void test_checkHappyNum() {
        assertEquals(new Exercise20().checkHappyNum(19), true);
        assertEquals(new Exercise20().checkHappyNum(21), false);
        assertEquals(new Exercise20().checkHappyNum(208), true);
    }

}
