package array;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Exercise07Test {
    @Test
    public void test_() {
        assertEquals(new Exercise07().findMaxAscSubArr(new int[] {2,9,16,1,3,4,5,6,7,6,6,8,10,1}), "1 3 4 5 6 7 ");
    }
}
