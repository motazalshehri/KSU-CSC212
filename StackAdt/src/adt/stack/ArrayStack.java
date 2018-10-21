package adt.stack;




public class ArrayStack<T> implements Stack<T> {

    private int maxsize;
    private int top;
    private T[] nodes;

    /**
     * Creates a new instance of ArrayStack
     *
     * @param n
     */
    public ArrayStack(int n) {
        maxsize = n;
        top = -1;
        nodes = (T[]) new Object[n];
    }

    @Override
    public boolean empty() {
        return top == -1;
    }

    @Override
    public boolean full() {
        return top == maxsize - 1;
    }

    @Override
    public void push(T e) {
        nodes[++top] = e;
    }

    @Override
    public T pop() {
        return nodes[top--];
    }
}
