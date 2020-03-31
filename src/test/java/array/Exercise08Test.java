package array;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Exercise08Test {
    @Test
    public void test_subMaxMin() {
        assertEquals(new Exercise08().subMaxMin(new int[] {5,9,21,9,6, 1,-1}), 22);
    }
}
