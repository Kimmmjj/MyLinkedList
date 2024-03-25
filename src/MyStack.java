
// Stack 구현
class MyStack<T> {
    MyLinkedList<T> list;

    MyStack() {
        list = new MyLinkedList<>();
    }

    void push(T data) {
        list.add(data);
    }

    T pop() {
        if (list.size == 0) {
            throw new IllegalStateException("Stack is empty");
        }
        T data = list.get(list.size - 1);
        list.delete(list.size - 1);
        return data;
    }
}