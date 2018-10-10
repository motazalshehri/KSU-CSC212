
package adt;


public class ArrayList<T> implements List<T> {

    private int maxsize;
    private int size;
    private int current;
    private T[] nodes;

    /**
     * Creates a new instance of ArrayList
     * @param n
     */
    public ArrayList(int n) {
        maxsize = n;
        size = 0;
        current = -1;
        nodes = (T[]) new Object[n];
    }

    @Override
    public boolean full() {
        return size == maxsize;
    }

    @Override
    public boolean empty() {
        return size == 0;
    }

    @Override
    public boolean last() {
        return current == size - 1;
    }

    @Override
    public void findFirst() {
        current = 0;
    }

    @Override
    public void findNext() {
        current++;
    }

    @Override
    public T retrieve() {
        return nodes[current];
    }

    @Override
    public void update(T val) {
        nodes[current] = val;
    }

    @Override
    public void insert(T val) {
        for (int i = size - 1; i > current; --i) {
            nodes[i + 1] = nodes[i];
        }
        current++;
        nodes[current] = val;
        size++;
    }

    @Override
    public void remove() {
        for (int i = current + 1; i < size; i++) {
            nodes[i - 1] = nodes[i];
        }
        size--;
        if (size == 0) {
            current = -1;
        } else if (current == size) {
            current = 0;
        }
        
    }
}
