package oop.lab8.task2;

public class Cube extends GeometricBody {
    public double length;

    public Cube(double length) {
        this.length = length;
    }

    @Override
    public double getSurface() {
        return length * length * 6;
    }

    @Override
    public double getVolume() {
        return Math.pow(length, 3);
    }

    public void print() {
        System.out.println("The surface of the cube is: " + getSurface());
        System.out.println("The volume of the cube is: " + getVolume() + "\n");
    }
}

