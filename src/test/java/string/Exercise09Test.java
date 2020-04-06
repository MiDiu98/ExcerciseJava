package string;

import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;

public class Exercise09Test {
    @Test
    public void test_findBarcodeEAN13() {
        assertEquals(new Exercise09().findBarcodeEAN13("893850597419"), 4);
        assertEquals(new Exercise09().findBarcodeEAN13("543850598234"), 0);
        assertEquals(new Exercise09().findBarcodeEAN13("893850"), -1);
    }
}
