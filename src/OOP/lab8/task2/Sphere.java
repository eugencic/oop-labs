package OOP.lab8.task2;

public class Sphere extends GeometricBody {
    public double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getSurface() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double getVolume() {
        return 4 / 3 * Math.PI * Math.pow(radius, 3);
    }

    public void print() {
        System.out.println("The surface of the sphere is: " + getSurface());
        System.out.println("The volume of the sphere is: " + getVolume() + "\n");
    }
}
