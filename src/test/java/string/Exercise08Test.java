package string;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class Exercise08Test {
    @Test
    public void test_() {
        assertTrue(new Exercise08().checkBarcodeEAN13("8938505974194"));
        assertFalse(new Exercise08().checkBarcodeEAN13("8938505974"));
    }
}
