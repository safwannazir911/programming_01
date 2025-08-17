package dsa.p3;

//Queue using Arrays

public class P11 {
    static int[] queue = new int[5];
    static int front = -1;
    static int rear = -1;

    static void enqueue(int val) {
        if (front == -1 && rear == -1) {
            front++;
            rear++;
            queue[rear] = val;
        } else {
            rear = rear + 1 % queue.length;
            queue[rear] = val;
        }
    }

    static void dequeue() {
        if (front == rear) {
            front = -1;
            rear = -1;
            return;
        }

        front = front + 1 % queue.length;
    }

    static void print() {
        if (front == -1 && rear == -1) {
            System.out.print("Empty Queue");
            return;
        }
        int temp = front;
        while (temp <= rear) {
            System.out.print(queue[temp]);
            temp++;
        }
    }

    public static void main(String[] args) {

        enqueue(3);
        enqueue(4);

        dequeue();

        print();

    }

}
