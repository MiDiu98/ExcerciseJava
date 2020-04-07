package string;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Exercise12Test {
    @Test
    public void test_() {
        assertEquals(new Exercise12().makeMaxNum(new int[] {10,2,11, 45,8,14}), "8452141110");
        assertEquals(new Exercise12().makeMaxNum(new int[] {12, 12115}), "1212115");
    }
}
