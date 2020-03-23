package basic;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Exercise08Test {
    @Test
    public void test_calPI() {
        assertEquals(new Exercise08().calPI(), "3.14155");
    }
}
