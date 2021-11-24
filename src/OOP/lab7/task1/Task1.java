package OOP.lab7.task1;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        Square square = new Square(5);
        square.print();

        Rectangle rectangle = new Rectangle(5, 6);
        rectangle.print();

        Triangle triangle = new Triangle(5, 6, 7);
        triangle.print();

        ArrayList<Figure> figuresList = new ArrayList<Figure>();
        figuresList.add(square);
        figuresList.add(rectangle);
        figuresList.add(triangle);
    }
}