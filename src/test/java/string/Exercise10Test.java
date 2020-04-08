package string;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Exercise10Test {
    @Test
    public void test_sumBigInteger() {
        assertEquals(new Exercise10().sumBigInteger("1274", "3464241"), "3465515");
        assertEquals(new Exercise10().sumBigInteger("89", "44"), "133");
    }
}
