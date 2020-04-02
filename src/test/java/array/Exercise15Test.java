package array;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Exercise15Test {
    @Test
    public void test_findNMax() {
        assertEquals(new Exercise15().findNMax(new int[] {1,6,3,9,3,21,7,3}, 3),
                Arrays.asList(21,9,7));
        assertEquals(new Exercise15().findNMax(new int[] {3,21,7,3}, 5),
                Arrays.asList(21,7,3,3));
        assertEquals(new Exercise15().findNMax(new int[] {}, 5),
                Arrays.asList());
    }
}
