package basic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise03Test {

    @Test
    public void test_analysisPrimeFactor() {

        assertEquals(new Exercise03().analysisPrimeFactor(1), "");
        assertEquals(new Exercise03().analysisPrimeFactor(3), "3");
        assertEquals(new Exercise03().analysisPrimeFactor(13), "13");
        assertEquals(new Exercise03().analysisPrimeFactor(600), "2 * 2 * 2 * 3 * 5 * 5");
    }
}
