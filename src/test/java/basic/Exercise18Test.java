package basic;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Exercise18Test {

    @Test
    public void test_transRomanNumToDecimal() {
        assertEquals(new Exercise18().transRomanNumToDecimal("MDLIV"), 1554);
        assertEquals(new Exercise18().transRomanNumToDecimal("MMCCXXII"), 2222);
        assertEquals(new Exercise18().transRomanNumToDecimal("MCMXCIX"), 1999);
        assertEquals(new Exercise18().transRomanNumToDecimal(""), 0);
        assertEquals(new Exercise18().transRomanNumToDecimal("V"), 5);
        assertEquals(new Exercise18().transRomanNumToDecimal("MKHLV"), -1);
    }
}
