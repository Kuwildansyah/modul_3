public class Latihan_2 {
    public void queueExample() {
        Queue queue = new Queue(4);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        System.out.println("dequeue: " + queue.dequeue());
        System.out.println("peek: " + queue.peek());
        System.out.println("dequeue: " + queue.dequeue());
        System.out.println("isEmpty: " + queue.isEmpty());
        queue.enqueue(5);
        queue.enqueue(6);
        System.out.println("isFull: " + queue.isFull());
        System.out.println("dequeue: " + queue.dequeue());
        System.out.println("dequeue: " + queue.dequeue());
        System.out.println("dequeue: " + queue.dequeue());
        System.out.println("dequeue: " + queue.dequeue());
        System.out.println("isEmpty: " + queue.isEmpty());
    }

    public static void main(String[] args) {
        new Latihan_2().queueExample();
    }
}