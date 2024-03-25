// Queue 구현
class MyQueue<T> {
    MyLinkedList<T> list;

    MyQueue() {
        list = new MyLinkedList<>();
    }

    void enqueue(T data) {
        list.add(data);
    }

    T dequeue() {
        if (list.size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        T data = list.get(0);
        list.delete(0);
        return data;
    }
}