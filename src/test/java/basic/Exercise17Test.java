package basic;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Exercise17Test {

    @Test
    public void test_findSquareRoot() {
        assertEquals(new Exercise17().findSqrtByBisection(16.0), 4.0, 0.0001);
        assertEquals(new Exercise17().findSqrtByBisection(3.0), 1.7319, 0.0001);
        assertEquals(new Exercise17().findSqrtByBisection(1.0), 1.0, 0.0001);
    }
}
