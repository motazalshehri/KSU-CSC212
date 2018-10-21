package adt.stack;

public class LinkedStack<T> implements Stack<T> {

    private Node<T> top;

    /* Creates a new instance of LinkStack */
    public LinkedStack() {
        top = null;
    }

    @Override
    public boolean empty() {
        return top == null;
    }

    @Override
    public boolean full() {
        return false;
    }

    @Override
    public void push(T e) {
        Node<T> tmp = new Node<T>(e);
        tmp.next = top;
        top = tmp;
    }

    @Override
    public T pop() {
        T e = top.data;
        top = top.next;
        return e;
    }
}
