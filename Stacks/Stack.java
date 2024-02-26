package Stacks;

import java.util.EmptyStackException;

public class Stack {
    private int[] stack;
    private int top;
    private int capacity;

    public Stack(int size) {
        stack = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + item);
            return;
        }
        stack[++top] = item;
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack[top--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        // Pushing elements
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());

        // Popping elements
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

        // Trying to pop from an empty stack
        try {
            while (!stack.isEmpty()) {
                System.out.println("Popped: " + stack.pop());
            }
            stack.pop(); // This line will throw EmptyStackException
        } catch (EmptyStackException e) {
            System.out.println("Attempted to pop from an empty stack.");
        }
    }
}
