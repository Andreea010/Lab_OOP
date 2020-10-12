package Lab2;
public class Queue {
    private int maxSize;
    private int[] queue;
    private int front;
    private int back;
    private int currentSize;

    public Queue() {
        this(0);
    }

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        queue = new int[maxSize];
        front = 0;
        back = -1;
        currentSize = 0;
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public boolean isFull() {
        return currentSize == maxSize;
    }

    public int front() {
        return queue[front];
    }

    public int getMaxSize() {
        return maxSize;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public void push(int value){
        if(isFull()) {
            System.out.println("Stack is Full");
            return;
        }
        queue[++front] = value;
        currentSize++;
        System.out.println(value + " was pushed in the queue");
    }

    public int pop(){
        currentSize--;
        if(isEmpty())
            return 0;
        return queue[front--];
    }

}
