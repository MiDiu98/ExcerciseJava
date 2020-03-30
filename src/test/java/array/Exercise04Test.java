package array;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Exercise04Test {

    @Test
    public void test_() {
        assertEquals(new Exercise04().sortSeparateEvenOdd(new Integer[] {6,7,16,9,2,57,24,7,8}), "2 6 8 16 24 57 9 7 7 ");
    }
}
