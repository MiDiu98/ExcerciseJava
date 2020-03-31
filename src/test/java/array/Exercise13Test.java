package array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Exercise13Test {

    @Test
    public void test_deleteRowColOfMatrix() {
        List<List<Integer>> arrTest = new ArrayList<List<Integer>>();
        arrTest.add(new ArrayList<>(Arrays.asList(1,1,1,1,1,1,1)));
        arrTest.add(new ArrayList<>(Arrays.asList(1,1,1,1,1,1,1)));
        arrTest.add(new ArrayList<>(Arrays.asList(1,1,1,1,1,1,1)));
        arrTest.add(new ArrayList<>(Arrays.asList(1,1,1,1,1,1,1)));

        assertEquals(new Exercise13().deleteRowColOfMatrix(
                new int[][] {
                        {1,1,2,1,1,1,1,1},
                        {2,2,2,2,2,2,2,2},
                        {1,1,2,1,1,1,1,1},
                        {1,1,2,1,1,1,1,1},
                        {1,1,2,1,1,1,1,1}},
                1, 2), arrTest);
        assertEquals(new Exercise13().deleteRowColOfMatrix(
                new int[][] {
                        {1,1,2,1,1,1,1,1},
                        {2,2,2,2,2,2,2,2},
                        {1,1,2,1,1,1,1,1},
                        {1,1,2,1,1,1,1,1},
                        {1,1,2,1,1,1,1,1}},
                1, 2), arrTest);
    }
}
