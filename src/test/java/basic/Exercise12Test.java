package basic;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Exercise12Test {

    @Test
    public void test_findSquareRoot() {
        assertEquals(new Exercise12().findSquareRoot(4.0), 2.0, 0.0001);
        assertEquals(new Exercise12().findSquareRoot(3.0), 1.7321, 0.0001);
    }
}
