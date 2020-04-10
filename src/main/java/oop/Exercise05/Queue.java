package oop.Exercise05;

public class Queue<T> {
    private T[] queue;
    int tail;

    public Queue() {
        queue = (T[]) new Object[100];
    }

    public boolean isEmpty() {
        return tail == 0;
    }

    public int size() {
        return tail;
    }

    public boolean offer(T item) {
        if (tail < 99) {
            queue[tail++] = item;
            return true;
        }
        return false;
    }

    public T poll() {
        if (tail > 0) {
            T res = queue[0];
            for (int i = 0; i < tail - 1; i++)
                queue[i] = queue[i + 1];
            tail--;
            return res;
        }
        return null;
    }

    public T peek() {
        return queue[0];
    }
}
