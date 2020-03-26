package basic;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Exercise17Test {

    @Test
    public void test_findSquareRoot() {
        assertEquals(new Exercise17().findSqrtByBisection(16), 4, 0.000001);
        assertEquals(new Exercise17().findSqrtByBisection(3), 1.732051, 0.000001);
        assertEquals(new Exercise17().findSqrtByBisection(1), 1, 0.000001);
        assertEquals(new Exercise17().findSqrtByBisection(0.5), 0.707106, 0.000001);
    }
}
