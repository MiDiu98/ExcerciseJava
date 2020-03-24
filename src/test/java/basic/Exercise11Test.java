package basic;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Exercise11Test {
    @Test
    public void test_findMonth() {
        assertEquals(new Exercise11().findMonth(1), "January");
        assertEquals(new Exercise11().findMonth(0), "Month is invalid");
        assertEquals(new Exercise11().findMonth(4), "April");
        assertEquals(new Exercise11().findMonth(12), "December");
        assertEquals(new Exercise11().findMonth(13), "Month is invalid");
    }
}
