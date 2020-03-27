package array;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Exercise05Test {

    @Test
    public void test_() {
        assertEquals(new Exercise05().sumPrime(new int[] {3,7,4,8,9,17,4,13,1, -1}), 40);
    }
}
