package OOP.lab2.task2;

public class Task2 {
    public static void main(String args[]) {

        Queue q1 = new Queue();
        Queue q2 = new Queue(3);

        q1.Pop();
        q1.Push(1);
        q1.Push(2);
        q1.Push(3);
        q1.Pop();
        q1.Print();

        q2.Push(1);
        q2.Push(2);
        q2.Push(3);
        q2.Pop();
        q2.Print();
    }
}
