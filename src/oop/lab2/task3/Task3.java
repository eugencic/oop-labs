package oop.lab2.task3;

public class Task3 {
    public static void main(String[] args) {
        Box box1 = new Box(1,5,10);

        System.out.println("The surface area of the box is: " + box1.getSurfaceArea());
        System.out.println("The volume of the box is: " + box1.getVolume());

        Queue q1 = new Queue();
        Queue q2 = new Queue(3);
        Queue q3 = new Queue(4);

        q1.push(1);
        q1.pop();
        q1.checkIsEmpty();
        q1.checkIsFull();

        q2.push(1);
        q2.push(2);
        q2.push(3);
        q2.checkIsEmpty();
        q2.checkIsFull();

        q3.push(4);
        q3.push(5);
        q3.checkIsEmpty();
        q3.checkIsFull();
    }
}
