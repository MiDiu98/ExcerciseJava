package oop.Exercise02;

import org.junit.Test;
import static org.junit.Assert.*;

public class StackNumberTest {
    @Test
    public void test_StackNumber() {
        assertEquals(new StackNumber().push(1),1);
        assertTrue(new StackNumber().isEmpty());
        assertEquals(new StackNumber().size(),0);

        StackNumber stack = new StackNumber();
        for (int i = 0; i < 5; i++)
            stack.push(i);

        assertEquals(stack.size(), 5);
        assertEquals(stack.search(1),4);
        assertEquals(stack.search(10),-1);
        assertEquals(stack.peek(), 4);
        assertEquals(stack.pop(), 4);
        assertEquals(stack.size(), 4);
        assertFalse(stack.isEmpty());
    }
}
