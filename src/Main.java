public class Main {
    public static void main(String[] args) {
        // MyLinkedList 테스트
        MyLinkedList<String> linkedList = new MyLinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        System.out.println("LinkedList: ");
        for (String item : linkedList) {
            System.out.print(item + " ");
        }
        System.out.println("\nGet(1): " + linkedList.get(1));
        linkedList.delete(1);
        System.out.println("After delete(1): ");
        for (String item : linkedList) {
            System.out.print(item + " ");
        }

        // MyQueue 테스트
        System.out.println("\n\nMyQueue: ");
        MyQueue<Integer> queue = new MyQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Dequeue: " + queue.dequeue());
        queue.enqueue(4);
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Dequeue: " + queue.dequeue());

        // MyStack 테스트
        System.out.println("\nMyStack: ");
        MyStack<Character> stack = new MyStack<>();
        stack.push('A');
        stack.push('B');
        stack.push('C');
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
        stack.push('D');
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
    }
}