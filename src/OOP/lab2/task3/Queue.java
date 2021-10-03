package OOP.lab2.task3;

public class Queue {
    int QueueSize;
    int MaxSize;
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
        QueueSize = 0;
        MaxSize = -1;
    }

    //Constructor with parameter
    public Queue(int value1) {
        front = null;
        rear = null;
        QueueSize = 0;
        MaxSize = value1;
    }

    //Remove item from the front of the queue.
    void Pop() {
        if (QueueSize > 0) {
            System.out.println("Element " + front.data + " removed from the queue");
            front = front.next;
            QueueSize--;
        } else System.out.println("The queue is empty yet");
    }

    //Add item at the rear of the queue.
    void Push(int data) {
        if (QueueSize < MaxSize || MaxSize == -1) {
            Node OldRear = rear;
            rear = new Node();
            rear.data = data;
            rear.next = null;
            if (QueueSize > 0) {
                OldRear.next = rear;
            } else front = rear;
            QueueSize++;
            System.out.println("Element " + data + " added to the queue");
        } else System.out.println("The queue is already full");
    }

    //Print the queue
    void Print() {
        Node FirstNode = front;
        System.out.println("The queue is ");
        if (FirstNode == null) {
            System.out.println("empty");
        }
        while (FirstNode != null) {
            System.out.println(FirstNode.data);
            FirstNode = FirstNode.next;
        }
    }

    //Check if the queue is empty
    boolean IsEmpty() {
        if (QueueSize == 0) {
            System.out.println("The queue is empty");
            return true;
        } else {
            System.out.println("The queue is not empty");
            return false;
        }
    }

    //Check if the queue is full
    boolean IsFull() {
        if (MaxSize == -1) {
            System.out.println("The queue will never be full");
            return false;
        }

        if (QueueSize < MaxSize) {
            System.out.println("The queue is not full yet");
            return false;
        }

        else {
            System.out.println("The queue is full");
            return true;
        }
    }
}
