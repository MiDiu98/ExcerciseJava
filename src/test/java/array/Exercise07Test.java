package array;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Exercise07Test {
    @Test
    public void test_findMaxAscSubArr() {

        assertEquals(
                new Exercise07().findMaxAscSubArr(
                        new int[]{2, 9, 16, 1, 3, 4, 5, 6, 7, 6, 6, 8, 10, 1}),
                Arrays.asList(1, 3, 4, 5, 6, 7));

        assertEquals(
                new Exercise07().findMaxAscSubArr(
                        new int[]{
                                1, 2, 4,
                                1, 3, 4, 5, 6, 7, 8, 9,
                                1, 2, 3, 4, 5, 6, 7, 8, 9}),
                Arrays.asList(  1, 2, 3, 4, 5, 6, 7, 8, 9));
    }
}
