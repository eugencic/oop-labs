package OOP.lab7.task1;

public class Triangle extends Figure {
    public double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    public void print() {
        System.out.println("The area of the triangle is: " + getArea());
        System.out.println("The perimeter of the triangle is: " + getPerimeter() + "\n");
    }
}
