import java.util.LinkedList;

public class Stack<T> {
    private LinkedList<T> list;

    public Stack() {
        list = new LinkedList<>();
    }

    // UC 1: Push method (56 -> 30 -> 70)
    public void push(T data) {
        list.addFirst(data);  // Adds to the front (top of stack)
    }

    // UC 2: Pop method (peaks and pops until empty)
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.removeFirst();  // Removes from the front (top of stack)
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.getFirst();  // Returns the front element (top of stack)
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void printStack() {
        for (T item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }


}
