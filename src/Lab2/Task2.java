package Lab2;

public class Task2 {
    public static void main(String[] args) {
        Queue firstQueue = new Queue(4);
        Queue secondQueue = new Queue();
        firstQueue.push(20);
        firstQueue.push(30);
        firstQueue.pop();
        System.out.println("Size = " + firstQueue.getSize());
        System.out.println("Empty = " + firstQueue.Empty());
        System.out.println("Full = " + firstQueue.Full());

        secondQueue.push(10);
        secondQueue.push(100);
        secondQueue.push(1000);
        secondQueue.pop();
        System.out.println("Size = "+ secondQueue.getSize());
        System.out.println("Empty status = "+ secondQueue.Empty());

    }
}
