package basic;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Exercise15Test {

    @Test
    public void test_findNumBit() {
        assertEquals(new Exercise15().reverseBit(23), 29);
    }
}
