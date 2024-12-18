public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // UC 1: Pushing 56 -> 30 -> 70
        stack.push(70);
        stack.push(30);
        stack.push(56);
        System.out.print("Stack after pushing 56 -> 30 -> 70: ");
        stack.printStack();  // Expected output: 56 30 70
    }
}

