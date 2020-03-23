package basic;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Exercise07Test {

    @Test
    public void test_calFactorial() {
        assertEquals(new Exercise07().calFactorial(3), 6);
        assertEquals(new Exercise07().calFactorial(1), 1);
    }
}
