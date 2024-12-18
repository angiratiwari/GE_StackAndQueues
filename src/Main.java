public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // UC 1: Pushing 56 -> 30 -> 70
        stack.push(70);
        stack.push(30);
        stack.push(56);
        System.out.print("Stack after pushing 56 -> 30 -> 70: ");
        stack.printStack();  // Expected output: 56 30 70

        // UC 2: Peeking and Popping
        System.out.println("Peek: " + stack.peek());  // Expected output: 56
        stack.pop();  // Pop 56
        System.out.print("Stack after pop: ");
        stack.printStack();  // Expected output: 30 70
        System.out.println("Peek: " + stack.peek());  // Expected output: 30
        stack.pop();  // Pop 30
        System.out.print("Stack after pop: ");
        stack.printStack();  // Expected output: 70
        stack.pop();  // Pop 70
        System.out.println("Is Stack Empty? " + stack.isEmpty());  // Expected output: true

        // Testing Queue with UC 3 and UC 4
        Queue<Integer> queue = new Queue<>();

        // UC 3: Enqueuing 56 -> 30 -> 70
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);
        System.out.print("Queue after enqueuing 56 -> 30 -> 70: ");
        queue.printQueue();  // Expected output: 56 30 70

        // UC 4: Dequeuing
        queue.dequeue();  // Remove 56
        System.out.print("Queue after dequeue: ");
        queue.printQueue();  // Expected output: 30 70
        queue.dequeue();  // Remove 30
        System.out.print("Queue after dequeue: ");
        queue.printQueue();  // Expected output: 70
        queue.dequeue();  // Remove 70
        System.out.println("Is Queue Empty? " + queue.isEmpty());  // Expected output: true
    }
}

