package com.company.practical3;

public class Stack {

    private static final int SIZE = 20;
    private int top;
    private int[] stack = new int[SIZE];

    public Stack() {
        top = -1;
    }

    public boolean isEmpty() {
        return (top < 0);
    }

    public boolean push(int item ) {

        if (top >= (SIZE - 1)) {

            return false;

        } else {

            stack[++top] = item;
            return true;

        }
    }

    public int pop() {

        if (isEmpty()) {

            System.out.println("Stack Underflow");
            return 0;

        } else {

            return stack[top--];

        }

    }

    public int peek() {

        if (isEmpty()) {

            System.out.println("Stack Underflow");
            return 0;

        } else {

            return stack[top];

        }

    }

}

class StackClient {

    public static void main(String[] args) {

        Stack stack = new Stack();
        System.out.println(stack.push(10));
        System.out.println(stack.push(20));
        System.out.println(stack.push(30));
        System.out.println(stack.pop() + " popped from stack");
        System.out.println("Peek Element : " + stack.peek());

    }

}
