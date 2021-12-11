package oop.lab7.task3;

public class Square extends Figure {
    public double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    public double getPerimeter() {
        return length * 4;
    }

    public void print() {
        System.out.println("The area of the square is: " + getArea());
        System.out.println("The perimeter of the square is: " + getPerimeter() + "\n");
    }
}

