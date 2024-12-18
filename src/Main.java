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
    }
}

