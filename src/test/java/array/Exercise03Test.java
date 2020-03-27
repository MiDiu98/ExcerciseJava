package array;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Exercise03Test {

    @Test
    public void test_subEvenOdd() {
        assertEquals(new Exercise03().subEvenOdd(new int[] {1, 5, 8, 9, 2, 7}), -12);
        assertEquals(new Exercise03().subEvenOdd(new int[]{}), 0);
    }
}
