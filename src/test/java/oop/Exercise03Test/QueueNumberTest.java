package oop.Exercise03Test;

import oop.Exercise03.QueueNumber;
import org.junit.Test;
import static org.junit.Assert.*;

public class QueueNumberTest {
    @Test
    public void test_QueueNumber() {
        QueueNumber queue = new QueueNumber();
        assertTrue(queue.isEmpty());
        assertEquals(queue.offer(3),true);
        assertEquals(queue.size(),1);
        assertEquals(queue.peek(),3);
        assertEquals(queue.poll(),3);
        assertTrue(queue.isEmpty());
        assertEquals(queue.size(),0);
        assertEquals(queue.poll(),0);

        for (int i = 1; i < 100; i++)
            queue.offer(i);
        assertFalse(queue.offer(100));
        assertEquals(queue.size(), 99);
        assertEquals(queue.poll(),1);
    }
}
