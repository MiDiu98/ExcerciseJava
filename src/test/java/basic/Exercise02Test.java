package basic;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Exercise02Test {

    @Test
    public void test_calSumDigitsOfNumber() {
        assertEquals(new Exercise02().calSumDigitsOfANumber("0"), 0);
        assertEquals(new Exercise02().calSumDigitsOfANumber("01234567"), 28);
        assertEquals(new Exercise02().calSumDigitsOfANumber("1234567"), 28);
    }
}
