package OOP.lab8.task2;

public class Parallelepiped extends GeometricBody {
    public double length;
    public double width;
    public double height;

    public Parallelepiped(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double getSurface() {
        return 2 * height * (width + 2 * length);
    }

    @Override
    public double getVolume() {
        return height * width * length;
    }

    public void print() {
        System.out.println("The surface of the parallelepiped is: " + getSurface());
        System.out.println("The volume of the parallelepiped is: " + getVolume() + "\n");
    }
}
