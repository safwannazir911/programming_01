package dsa.p2;

class MyQueue {
    Node front, rear;

    void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    void dequeue() {
        if (front == null) throw new RuntimeException("dsa.p1.Queue Underflow");
        front = front.next;
        if (front == null) rear = null;
    }

    void peek() {
        if (front == null) throw new RuntimeException("Empty dsa.p1.Queue");
        System.out.print(front.data);
    }

    void print() {
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");

    }


}

public class Queue {

    public static void main(String[] args) {
        MyQueue queue=new MyQueue();
        queue.enqueue(22);
        queue.enqueue(23);
        queue.enqueue(24);

        queue.dequeue();

        queue.print();

    }

}
