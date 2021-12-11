package oop.lab8.task1;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        Cube cube = new Cube(5);
        cube.print();

        Sphere sphere = new Sphere(5);
        sphere.print();

        Parallelepiped parallelepiped = new Parallelepiped(5, 6, 7);
        parallelepiped.print();

        ArrayList<GeometricBody> bodies = new ArrayList<GeometricBody>();
        bodies.add(cube);
        bodies.add(sphere);
        bodies.add(parallelepiped);
    }
}