package oop.lab8.task2;

import java.util.ArrayList;

public class GeometricBodyController {
    public GeometricBody getMaxSurface(ArrayList<GeometricBody> bodies) {
        GeometricBody[] bodyArray = bodies.toArray(new GeometricBody[0]);
        double maxSurface = 0;
        GeometricBody body = null;
        for (GeometricBody b : bodyArray) {
            if (b.getSurface() > maxSurface) {
                maxSurface = b.getSurface();
                body = b;
            }
        }
        return body;
    }

    public GeometricBody getMaxVolume(ArrayList<GeometricBody> bodies) {
        GeometricBody[] bodyArray = bodies.toArray(new GeometricBody[0]);
        double maxVolume = 0;
        GeometricBody body = null;
        for (GeometricBody b : bodyArray) {
            if (b.getVolume() > maxVolume) {
                maxVolume = b.getVolume();
                body = b;
            }
        }
        return body;
    }
}
