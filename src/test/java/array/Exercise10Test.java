package array;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Exercise10Test {

    @Test
    public void test_insertToAscArr() {
        assertEquals(new Exercise10().insertToAscArr(new int[] {1,3,5,7,9,12,15,26,58}, 20), Arrays.asList(1,3,5,7,9,12,15,20,26,58));
        assertEquals(new Exercise10().insertToAscArr(new int[] {1,3,5,7,9,12,15,26,58}, 0), Arrays.asList(0,1,3,5,7,9,12,15,26,58));
        assertEquals(new Exercise10().insertToAscArr(new int[] {1,3,5,7,9,12,15,26,58}, 60), Arrays.asList(1,3,5,7,9,12,15,26,58,60));
    }
}
