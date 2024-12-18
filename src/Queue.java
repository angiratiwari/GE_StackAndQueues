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

    // UC 4: Dequeue method (dequeues from the beginning)
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return list.removeFirst();  // Removes from the front (head of queue)
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void printQueue() {
        for (T item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
