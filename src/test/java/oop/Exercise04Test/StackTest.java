package oop.Exercise04Test;

import oop.Exercise04.Stack;
import org.junit.Test;
import static org.junit.Assert.*;

public class StackTest {
    @Test
    public void test_Stack() {
        assertEquals(new Stack<Integer>().size(),0);
        assertTrue(new Stack<Integer>().isEmpty());

        Stack<Integer> stackInt = new Stack<Integer>();
        for (int i = 0; i < 5; i++)
            stackInt.push(i);
        assertEquals(stackInt.size(),5);
        assertFalse(stackInt.isEmpty());
        assertEquals(stackInt.peek(),Integer.valueOf(4));
        assertEquals(stackInt.pop(),Integer.valueOf(4));
        assertEquals(stackInt.size(),4);

        Stack<String> stackS = new Stack<String>();
        stackS.push("stack");
        assertEquals(stackS.pop(), "stack");
    }
}
