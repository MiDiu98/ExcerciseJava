package array;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Exercise12Test {
    @Test
    public void test_checkEquivalentArr() {
        assertEquals(new Exercise12().checkEquivalentArr(
                new int[] {1,2,3,5,6,8,9},
                new int[] {1,2,8,5,6,3,9}),
                true);
        assertEquals(new Exercise12().checkEquivalentArr(
                new int[] {1,2,8,5,6,3,9},
                new int[] {1,2,8,5,6,3,9}),
                true);

        assertEquals(new Exercise12().checkEquivalentArr(
                new int[] {1,6,3,5,2,8,9},
                new int[] {1,2,8,5,6,3,9}),
                false);
        assertEquals(new Exercise12().checkEquivalentArr(
                new int[] {1,6,13,5,2,8,9},
                new int[] {1,2,8,5,6,3,9}),
                false);
        assertEquals(new Exercise12().checkEquivalentArr(
                new int[] {1,6,3,5,2,8,9},
                new int[] {1,2,8,5,6,3,9,1}),
                false);
    }
}
