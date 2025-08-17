package dsa.p1;

class ArrayQueue {
    private int[] queueArray;
    private int front, rear, size, capacity;

    public ArrayQueue(int c) {
        capacity = c;
        queueArray = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Enqueue operation
    public void enqueue(int element) {
        if (size == capacity) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % capacity;  // Circular increment
        queueArray[rear] = element;
        size++;
        System.out.println(element + " enqueued");
    }

    // Dequeue operation
    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        int removedElement = queueArray[front];
        front = (front + 1) % capacity;  // Circular increment
        size--;
        return removedElement;
    }

    // Peek at the front element
    public int peek() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queueArray[front];
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }
}

public class Queue {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Front element: " + queue.peek());  // Output: 10
        System.out.println("Dequeued: " + queue.dequeue());  // Output: 10
        System.out.println("Dequeued: " + queue.dequeue());  // Output: 20
    }
}
