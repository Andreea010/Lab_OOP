package Lab2;

import java.util.*;

class Queue {
    int[] queue;
    int front;
    int tail;
    int size;
    int length;

    public Queue() {
        front = 0;
        tail = 0;
        size = 0;
        length = 0;
        queue = new int[size];

    }

    public Queue(int n) {
        size = n;
        queue = new int[size];
        front = -1;
        tail = -1;
        length = 0;
    }

    public boolean Empty() {
        return front == -1;
    }

    public boolean Full() {
        return front == 0 && tail == size - 1;
    }

    public int getSize() {
        return length;
    }

    public void push(int i) {
        if (tail == -1) {
            front = 0;
            tail = 0;
            queue[tail] = i;
        } else if (tail + 1 < size)
            queue[tail++] = i;
        length++;
    }


    public void pop() {
        length--;
        int a = queue[front];
        if (front == tail) {
            front = -1;
            tail = -1;
        } else
            front++;
    }
}
