package basic;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Exercise04Test {

    @Test
    public void test_findFibonacciSequence() {
        assertEquals(new Exercise04().findFibonacciSequence(8), "1 1 2 3 5 8");
        assertEquals(new Exercise04().findFibonacciSequence(14), "1 1 2 3 5 8 13");
        assertEquals(new Exercise04().findFibonacciSequence(1), "");
        assertEquals(new Exercise04().findFibonacciSequence(0), "");
        assertEquals(new Exercise04().findFibonacciSequence(2), "1 1 2");
    }

}
