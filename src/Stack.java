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

    public void printStack() {
        for (T item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }


}
