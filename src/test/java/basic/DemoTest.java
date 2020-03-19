package basic;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DemoTest {

    @Test
    public void test_sum(){
        assertEquals(new Demo().sum(2, 8), 10);
    }

    @Test
    public void test_sub() {
        assertEquals(new Demo().sub(6, 4), 2);
    }

    @Test
    public void test_multi() {
        assertEquals(new Demo().multiple(4, 6), 24);
    }
}
