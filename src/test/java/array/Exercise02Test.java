package array;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Exercise02Test {

    @Test
    public void test_() {
        assertEquals(new Exercise02().sumThreeNumLargest(new int[] {45, 3, 6, 8, 40, 60, 80, 55}), 195);
        assertEquals(new Exercise02().sumThreeNumLargest(new int[] {45, 3}), 48);
        assertEquals(new Exercise02().sumThreeNumLargest(new int[5]), 0);
        assertEquals(new Exercise02().sumThreeNumLargest(new int[] {}), 0);
    }
}
