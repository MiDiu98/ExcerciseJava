package basic;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Exercise06Test {

    @Test
    public void test_calSumDigitsOfNumber() {
        assertEquals(new Exercise06().sumSequenceOfNum(3), 20);
    }
}
