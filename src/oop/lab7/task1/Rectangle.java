package oop.lab7.task1;

public class Rectangle extends Figure {
    public double length;
    public double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    public void print() {
        System.out.println("The area of the rectangle is: " + getArea());
        System.out.println("The perimeter of the rectangle is: " + getPerimeter() + "\n");
    }
}
