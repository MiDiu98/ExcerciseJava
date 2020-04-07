package string;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Exercise11Test {
    @Test
    public void test_subBigInteger() {
        assertEquals(new Exercise11().subBigInteger("12","46"), "-34");
        assertEquals(new Exercise11().subBigInteger("463","12"), "451");
        assertEquals(new Exercise11().subBigInteger("12","41"), "-29");
        assertEquals(new Exercise11().subBigInteger("100","99"), "1");
        assertEquals(new Exercise11().subBigInteger("482","27932"), "-27450");
    }
}
