import java.util.Iterator;

class MyLinkedList<T> implements Iterable<T> {
    Node<T> head;
    Node<T> tail;
    int size;

    MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    void delete(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
        } else {
            Node<T> prev = head;
            for (int i = 0; i < index - 1; i++) {
                prev = prev.next;
            }
            prev.next = prev.next.next;
            if (index == size - 1) {
                tail = prev;
            }
        }
        size--;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyLinkedListIterator<>(this);
    }

    private class MyLinkedListIterator<T> implements Iterator<T> {
        Node<T> current;

        MyLinkedListIterator(MyLinkedList<T> list) {
            current = (Node<T>) list.head;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            T data = current.data;
            current = current.next;
            return data;
        }
    }
}
