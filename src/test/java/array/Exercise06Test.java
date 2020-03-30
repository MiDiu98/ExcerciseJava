package array;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Exercise06Test {

    @Test
    public void test_() {
        assertEquals(new Exercise06().sortNotChangePositionEvenOdd(new int[] {4, 1, 3, 14, 10, 2, 11, 6, 7}), "2 11 7 4 6 10 3 14 1 ");
    }
}
