package oop.lab2.task2;

public class Queue {
    int queueSize;
    int maxSize;
    Node front, rear;

    //Linked list node
    class Node {
        int data;
        Node next;
    }

    //Constructor without parameter
    public Queue() {
        front = null;
        rear = null;
        queueSize = 0;
        maxSize = -1;
    }

    //Constructor with parameter
    public Queue(int value1) {
        front = null;
        rear = null;
        queueSize = 0;
        maxSize = value1;
    }

    //Remove item from the front of the queue.
    void pop() {
        if (queueSize > 0) {
            System.out.println("Element " + front.data + " removed from the queue");
            front = front.next;
            queueSize--;
        } else System.out.println("The queue is empty yet");
    }

    //Add item at the rear of the queue.
    void push(int data) {
        if (queueSize < maxSize || maxSize == -1) {
            Node oldRear = rear;
            rear = new Node();
            rear.data = data;
            rear.next = null;
            if (queueSize > 0) {
                oldRear.next = rear;
            } else front = rear;
            queueSize++;
            System.out.println("Element " + data + " added to the queue");
        } else System.out.println("The queue is already full");
    }

    //Print the queue
    void print() {
        Node firstNode = front;
        System.out.println("The queue is ");
        if (firstNode == null) {
            System.out.println("empty");
        }
        while (firstNode != null) {
            System.out.println(firstNode.data);
            firstNode = firstNode.next;
        }
    }
}
