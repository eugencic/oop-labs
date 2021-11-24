package OOP.lab7.task2;

import java.util.ArrayList;

public class Task2 {
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

        FigureController figureController = new FigureController();

        Figure biggestArea = figureController.getMaxArea(figuresList);
        System.out.println("Max area: " + biggestArea.getArea());

        Figure biggestPerimeter = figureController.getMaxPerimeter(figuresList);
        System.out.println("Max perimeter: " + biggestPerimeter.getPerimeter());
    }
}