package oop.lab2.task2;

public class Task2 {
    public static void main(String args[]) {

        Queue q1 = new Queue();
        Queue q2 = new Queue(3);

        q1.pop();
        q1.push(1);
        q1.push(2);
        q1.push(3);
        q1.pop();
        q1.print();

        q2.push(1);
        q2.push(2);
        q2.push(3);
        q2.pop();
        q2.print();
    }
}
