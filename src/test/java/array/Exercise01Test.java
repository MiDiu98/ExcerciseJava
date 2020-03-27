package array;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Exercise01Test {

    @Test
    public void test_findElementsRepeat() {
        assertEquals(new Exercise01().findElementsRepeat(new int[]{11, 2, 5, 3, 7, 2, 11}), "11 2 ");
        assertEquals(new Exercise01().findElementsRepeat(new int[]{2, 5, 3, 7, 2, 7, 3, 2}), "2 3 7 ");
        assertEquals(new Exercise01().findElementsRepeat(new int[]{}), "");
    }
}
