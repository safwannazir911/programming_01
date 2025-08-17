package dsa.p2;

class MyStack {
    Node top;

    void push(int data) {
        Node node = new Node(data);

        if (top == null) {
            top = node;
        } else {
            node.next = top;
            top = node;
        }
    }

    void pop() {
        if (top == null) throw new RuntimeException("dsa.p1.dsa.p2.Stack Underflow");
        top = top.next;
    }

    void peek() {
        if (top == null) throw new RuntimeException("Empty dsa.p1.dsa.p2.Stack");
        System.out.print(top.data);
    }


}
public class Stack{
    public static void main(String[] args){
        MyStack stack= new MyStack();
        stack.push(44);
        stack.push(45);
        stack.pop();
        stack.peek();
    }
}
