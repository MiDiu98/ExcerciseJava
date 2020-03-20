package basic;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Exercise02Test {

    @Test
    public void test_calSumDigitsOfNumber() {
        assertEquals(new Exercise02().calSumDigitsOfANumber(0), 0);
        assertEquals(new Exercise02().calSumDigitsOfANumber(8790), 24);
        assertEquals(new Exercise02().calSumDigitsOfANumber(8973), 27);
    }
}
