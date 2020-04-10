package oop.Exercise05Test;

import oop.Exercise05.Queue;
import org.junit.Test;
import static org.junit.Assert.*;

public class QueueTest {
    @Test
    public void test_Queue() {
        assertEquals(new Queue<>().size(),0);
        assertTrue(new Queue<Integer>().isEmpty());
        assertEquals(new Queue<Integer>().poll(),null);

        Queue<Integer> queueInt = new Queue<>();
        for (int i = 0; i < 99; i++)
            queueInt.offer(i);
        assertEquals(queueInt.size(),99);
        assertFalse(queueInt.isEmpty());
        assertFalse(queueInt.offer(99));

        assertEquals(queueInt.peek(),Integer.valueOf(0));
        assertEquals(queueInt.poll(),Integer.valueOf(0));
        assertEquals(queueInt.size(),98);

        Queue<String> stackS = new Queue<>();
        stackS.offer("stack");
        assertEquals(stackS.poll(), "stack");
    }
}
