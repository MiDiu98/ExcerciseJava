package basic;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Exercise05Test {

    @Test
    public void test_soluteQuadraticEquation() {
        assertEquals(new Exercise05().soluteQuadraticEquation(0, 6, 3), "Error: Not is a quadratic equation");
        assertEquals(new Exercise05().soluteQuadraticEquation(2, 3, 2), "The equation has no real roots.");
        assertEquals(new Exercise05().soluteQuadraticEquation(2, 4, 2), "The root is x = -1.00");
        assertEquals(new Exercise05().soluteQuadraticEquation(2, 5, 3), "The roots are x1 = -1.00 and x2 = -1.50" );
    }
}
