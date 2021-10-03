package OOP.lab2.task1;

public class Task1 {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(2);
        Box box3 = new Box(3,4,5);
        box1.Display();
        box2.Display();
        box3.Display();
    }
}
