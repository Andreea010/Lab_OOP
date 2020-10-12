package Lab2;
class queueMain {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.push(10);
        queue.push(1);
        queue.push(20);
        System.out.println(queue.pop() + " was popped from the queue");
        System.out.print("The queue is full: " + queue.isFull());
        System.out.print("The queue is empty: " + queue.isEmpty());
        System.out.print("Queue size " + queue.getCurrentSize() + "\n");

        Queue queue1 = new Queue();
        System.out.print("\n The queue is full: " + queue1.isFull());
        System.out.print("\n The queue is empty: " + queue1.isEmpty());
        System.out.print("\n Queue size " + queue1.getCurrentSize());
    }
}
