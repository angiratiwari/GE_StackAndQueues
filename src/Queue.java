import java.util.LinkedList;

public class Queue<T> {
    private LinkedList<T> list;

    public Queue() {
        list = new LinkedList<>();
    }

    // UC 3: Enqueue method (56 -> 30 -> 70)
    public void enqueue(T data) {
        list.addLast(data);  // Adds to the end (tail of queue)
    }

    public void printQueue() {
        for (T item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
