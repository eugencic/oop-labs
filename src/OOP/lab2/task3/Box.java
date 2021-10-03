package OOP.lab2.task3;

public class Box {
    double height;
    double width;
    double depth;

    public Box() {
        height = 1;
        width = 1;
        depth = 1;
    }

    public Box(double value1) {
        height = value1;
        width = value1;
        depth = value1;
    }

    public Box(double value1, double value2, double value3) {
        height = value1;
        width = value2;
        depth = value3;
    }

    public void Display() {
        System.out.println("The sizes of the box: \n" +
                "Height = " + height + "\n" +
                "Width = " + width + "\n" +
                "Depth = " + depth );
    }

    double SurfaceArea() {
        return 2 * (height * width + height * depth + width * depth);
    }

    double Volume () {
        return height * width * depth;
    }
}
