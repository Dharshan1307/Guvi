package Day7;

public class Push {

    private int[] stackArray;
    private int top;
    private int capacity;

    public Push(int size) {
        capacity = size;
        stackArray = new int[size];
        top = -1; 
    }

    private boolean isFull() {
        return top == capacity - 1;
    }

    private boolean isEmpty() {
        return top == -1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
        } else {
            stackArray[++top] = value;
            System.out.println("Pushed " + value + " to the stack");
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop");
            return -1; // or throw an exception
        } else {
            return stackArray[top--];
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Nothing to peek");
            return -1;
        } else {
            return stackArray[top];
        }
    }

    public static void main(String[] args) {
        Push stack = new Push(3);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40); 

        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Top element after pop: " + stack.peek());
    }
}
