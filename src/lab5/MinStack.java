package lab5;

import java.util.Stack;

public class MinStack<E> {

    // store elements of stack
    private int arr[];
    // represent top of stack
    private int top;
    // total capacity of the stack
    private int capacity;

    private Stack<Integer> minStack = new Stack<>();

    // Creating a stack
    MinStack(int size) {
        // initialize the array
        // initialize the stack variables
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // push elements to the top of stack
    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack OverFlow");

            // terminates the program
            System.exit(1);
        }

        if (isEmpty()) {
            minStack.push(x);
        } else {
            int y = minStack.peek();
            minStack.push(Math.min(x, y));
        }
        // insert element on top of stack
        arr[++top] = x;
    }

    // pop elements from top of stack
    public int pop() {

        // if stack is empty
        // no element to pop
        if (isEmpty()) {
            System.out.println("STACK EMPTY");
            // terminates the program
            System.exit(1);
        }

        // pop element from top of stack
        minStack.pop();
        return arr[top--];
    }

    public int peek() {
        return arr[top];
    }

    // return size of the stack
    public int getSize() {
        return top + 1;
    }

    // check if the stack is empty
    public Boolean isEmpty() {
        return top == -1;
    }

    // check if the stack is full
    public Boolean isFull() {
        return top == capacity - 1;
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinStack stack = new MinStack(15);

        stack.push(2);
        stack.push(1);
        stack.push(91);
        stack.push(1);
        stack.push(-3);
        stack.push(-2);
        System.out.println(stack.getMin());
        stack.pop();
        stack.pop();
        System.out.println(stack.getMin());

    }
}
