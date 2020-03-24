package basic;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Exercise09Test {

    @Test
    public void test_calPI(){
        assertEquals(new Exercise09().calPI(), "3.141598");
    }
}
