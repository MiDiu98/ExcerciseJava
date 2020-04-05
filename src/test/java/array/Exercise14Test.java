package array;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Exercise14Test {

    @Test
    public void test_detMatrix() {
        assertEquals(new Exercise14().detMatrix(
                new int[][] {
                        {-2,2,-3},
                        {-1,1,3},
                        {2,0,-1}
                }), 18);
        assertEquals(new Exercise14().detMatrix(
                new int[][] {
                        {-1,2},
                        {3,5}
                }), -11);
        assertEquals(new Exercise14().detMatrix(
                new int[][] {
                        {1}
                }), 1);

        assertEquals(new Exercise14().detMatrix(
                new int[][] {
                        {1,1,2,2},
                        {-3,1,5,1},
                        {-2,5,0,0},
                        {2,-1,3,-1}
                }), 224);
        assertEquals(new Exercise14().detMatrix(
                new int[][] {}), 0);
    }
}
