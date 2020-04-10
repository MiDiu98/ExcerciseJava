package oop.Exercise02;

public class StackNumber {
    private int[] stack;
    private int count;

    public StackNumber() {
        stack = new int[100];
    }

    public int push(int item) {
        stack[count++] = item;
        return item;
    }
    public int pop() {
        return stack[--count];
    }

    public int peek() {
        return stack[count - 1];
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public int search(int item) {
        int i = count;
        while (i >= 0 && stack[i] != item) i--;
        return i >= 0 ? count - i : -1;
    }

    public int size() {
        return count;
    }
}
