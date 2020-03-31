package array;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Exercise09Test {
    @Test
    public void test_searchBinary() {
        assertEquals(new Exercise09().searchBinary(new int[] {2,6,9,11,17,18, 94, 195}, 11), 3);
        assertEquals(new Exercise09().searchBinary(new int[] {2,6,9,11,17,18, 94, 112, 195}, 112), 7);
        assertEquals(new Exercise09().searchBinary(new int[] {2,6,9,11,17,18, 94, 112, 195}, 95), -1);
        assertEquals(new Exercise09().searchBinary(new int[] {}, 2 ), -1);
    }
}
