package dsa.p1;

public class Stack {
    public static class CustomStack {
        private int[] stackArray;
        private int top;
        private int capacity;

        // Constructor to initialize the stack
        public CustomStack(int size) {
            capacity = size;
            stackArray = new int[size];
            top = -1;
        }

        // Push operation
        public void push(int element) {
            if (top == capacity - 1) {
                System.out.println("dsa.p2.Stack is full");
            } else {
                stackArray[++top] = element;
                System.out.println(element + " pushed to stack");
            }
        }

        // Pop operation
        public int pop() {
            if (top == -1) {
                System.out.println("dsa.p2.Stack is empty");
                return -1; // Return -1 if the stack is empty
            } else {
                return stackArray[top--];
            }
        }

        // Peek operation
        public int peek() {
            if (top == -1) {
                System.out.println("dsa.p2.Stack is empty");
                return -1; // Return -1 if the stack is empty
            } else {
                return stackArray[top];
            }
        }

        // Check if the stack is empty
        public boolean isEmpty() {
            return top == -1;
        }

        // Get the size of the stack
        public int size() {
            return top + 1;
        }
    }


    public static void main(String[] args) {
        CustomStack stack = new CustomStack(5);

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Peek the top element
        System.out.println("Top element: " + stack.peek());  // Output: Top element: 30

        // Pop elements from the stack
        System.out.println("Popped element: " + stack.pop());  // Output: Popped element: 30
        System.out.println("Popped element: " + stack.pop());  // Output: Popped element: 20

        System.out.println("Top element: " + stack.peek());  // Output: Top element: 30

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());  // Output: Is stack empty? false
    }

}
