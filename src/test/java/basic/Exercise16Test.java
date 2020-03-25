package basic;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Exercise16Test {

    @Test
    public void test_countFibo() {
        assertEquals(new Exercise16().countFibo(1), 2);
        assertEquals(new Exercise16().countFibo(0), 0);
        assertEquals(new Exercise16().countFibo(3), 4);
        assertEquals(new Exercise16().countFibo(9), 6);
    }
}
