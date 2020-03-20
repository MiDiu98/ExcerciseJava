package basic;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Exercise03Test {

    @Test
    public void test_analysisPrimeFactor() {
        assertEquals(new Exercise03().analysisPrimeFactor(12), "2 * 2 * 3");
        assertEquals(new Exercise03().analysisPrimeFactor(1), "");
        assertEquals(new Exercise03().analysisPrimeFactor(3), "3");
        assertEquals(new Exercise03().analysisPrimeFactor(13), "13");
    }
}
