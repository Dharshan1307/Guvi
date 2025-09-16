package Day7;

public class ArrayStack {
    private int maxSize;
    private int top;
    private int[] stackArr;

    public ArrayStack(int size) {
        maxSize = size;
        top = -1;
        stackArr = new int[maxSize];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full, Cannot push " + value);
        } else {
            stackArr[++top] = value;
            System.out.println("Pushed " + value + " to the stack.");
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Nothing to pop");
            return -1;
        } else {
            return stackArr[top--];
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Nothing to peek");
            return -1;
        } else {
            return stackArr[top];
        }
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Top Element : " + stack.peek());
        System.out.println("Popped Element : " + stack.pop());
        System.out.println("Top Element after pop : " + stack.peek());
    }
}
