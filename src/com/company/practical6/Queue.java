package com.company.practical6;

import com.company.practical3.Stack;

public class Queue {

    private Stack stack1 = new Stack();
    private Stack stack2 = new Stack();

    //Performing Enqueue Operation

    public boolean enqueue (int item) {

        return stack1.push(item);

    }

    //Performing Dequeue Operation

    public int dequeue() {

        if(stack1.isEmpty() && stack2.isEmpty()) {

            System.out.println("Queue Underflow");
            return 0;

        } else if(stack2.isEmpty()) {

            while (!stack1.isEmpty()) {

                stack2.push(stack1.pop());

            }

        }

        return stack2.pop();

    }

}

class QueueClient {

    public static void main(String[] args) {

        Queue queue = new Queue();

        //Adding items to Queue
        System.out.println(queue.enqueue(10));
        System.out.println(queue.enqueue(20));
        System.out.println(queue.enqueue(30));

        //Removing items from Queue
        System.out.println(queue.dequeue() + " is removed from queue");
        System.out.println(queue.dequeue() + " is removed from queue");

        //Adding item to Queue
        System.out.println(queue.enqueue(40));

        //Removing items from Queue
        System.out.println(queue.dequeue() + " is removed from queue");
        System.out.println(queue.dequeue() + " is removed from queue");

    }

}