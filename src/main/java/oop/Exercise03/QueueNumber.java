package oop.Exercise03;

public class QueueNumber {
    int[] queue;
    int tail;

    public QueueNumber() {
        queue = new int[100];
    }

    public boolean isEmpty() {
        return tail == 0;
    }

    public int size() {
        return tail;
    }

    public boolean offer(int item) {
        if (tail < 99) {
            queue[tail++] = item;
            return true;
        }
        return false;
    }

    public int poll() {
        if (tail > 0) {
            int res = queue[0];
            for (int i = 0; i < tail - 1; i++)
                queue[i] = queue[i + 1];
            tail--;
            return res;
        }
        return 0;
    }

    public int peek() {
        return queue[0];
    }
}
