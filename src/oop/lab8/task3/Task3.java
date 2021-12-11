package oop.lab8.task3;

import java.util.ArrayList;

public class Task3 {
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

        GeometricBodyController geometricBodyController = new GeometricBodyController();

        GeometricBody biggestSurface = geometricBodyController.getMaxSurface(bodies);
        System.out.println("Max surface: " + biggestSurface.getSurface());

        GeometricBody biggestVolume = geometricBodyController.getMaxVolume(bodies);
        System.out.println("Max volume: " + biggestVolume.getVolume());
    }
}