package array;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Exercise11Test {

    @Test
    public void test_sumMaxSubArr() {
        assertEquals(new Exercise11().sumMaxSubArr(new int[] {0, 1, -2, 8, 9, 0, 1, -2, 1, 1, 3, 1, 1}), 18);
    }
}
