package OOP.lab7.task2;

import java.util.ArrayList;

public class FigureController {
    public Figure getMaxArea(ArrayList<Figure> figures) {
        Figure[] figArray = figures.toArray(new Figure[0]);
        double maxArea = 0;
        Figure fig = null;
        for (Figure f : figArray) {
            if (f.getArea() > maxArea) {
                maxArea = f.getArea();
                fig = f;
            }
        }
        return fig;
    }

    public Figure getMaxPerimeter(ArrayList<Figure> figures) {
        Figure[] figArray = figures.toArray(new Figure[0]);
        double maxPerimeter = 0;
        Figure fig = null;
        for (Figure f : figArray) {
            if (f.getPerimeter() > maxPerimeter) {
                maxPerimeter = f.getPerimeter();
                fig = f;
            }
        }
        return fig;
    }
}
