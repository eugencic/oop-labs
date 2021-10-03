package OOP.lab2.task3;

public class Task3 {
    public static void main(String[] args) {
        Box box1 = new Box(1,5,10);

        System.out.println("The surface area of the box is: " + box1.SurfaceArea());
        System.out.println("The volume of the box is: " + box1.Volume());

        Queue q1 = new Queue();
        Queue q2 = new Queue(3);
        Queue q3 = new Queue(4);

        q1.Push(1);
        q1.Pop();
        q1.IsEmpty();
        q1.IsFull();

        q2.Push(1);
        q2.Push(2);
        q2.Push(3);
        q2.IsEmpty();
        q2.IsFull();

        q3.Push(4);
        q3.Push(5);
        q3.IsEmpty();
        q3.IsFull();
    }
}
