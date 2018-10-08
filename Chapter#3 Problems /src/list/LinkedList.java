

package list;


public class LinkedList<T> implements List<T> {

    private Node<T> head;
    private Node<T> current;

    public LinkedList() {
        head = current = null;
    }

    @Override
    public boolean empty() {
        return head == null;
    }

    @Override
    public boolean last() {
        return current.next == null;
    }

    @Override
    public boolean full() {
        return false;
    }

    @Override
    public void findFirst() {
        current = head;
    }

    @Override
    public void findNext() {
        current = current.next;
    }

    @Override
    public T retrieve() {
        return current.data;
    }

    @Override
    public void update(T val) {
        current.data = val;

    }

    @Override
    public void insert(T val) {
        Node<T> tmp;
        if (empty()) {
            current = head = new Node<T>(val);
        } else {
            tmp = current.next;
            current.next = new Node<T>(val);
            current = current.next;
            current.next = tmp;
        }
    }

    @Override
    public void remove() {
        if (current == head) {
            head = head.next;
        } else {
            Node<T> tmp = head;

            while (tmp.next != current) {
                tmp = tmp.next;
            }

            tmp.next = current.next;
        }

        if (current.next == null) {
            current = head;
        } else {
            current = current.next;
        }
    }
}
