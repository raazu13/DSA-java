package Queue.InbuiltImplementation;

public class Main {
    public static void main(String[] args) {
        QueueArray queue = new QueueArray(3);

        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.println(queue.peek());
        queue.dequeue();
        System.out.println(queue.peek());
        System.out.println(queue.isFull());
        queue.enqueue(6);
        System.out.println(queue.peek());
    }
}
