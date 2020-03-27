package basic;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Exercise19Test {

    @Test
    public void test_() {
        assertEquals(new Exercise19().transRomanNumToDecimal(1789), "MDCCLXXXIX");
        assertEquals(new Exercise19().transRomanNumToDecimal(576), "DLXXVI");
    }
}
