package oop.lab7.task3;

import java.util.ArrayList;

public class Task3 {
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
        System.out.println("Max perimeter: " + biggestPerimeter.getPerimeter() + "\n");

        var circle = new Figure() {
            double radius = 7;

            @Override
            public double getArea() {
                return Math.PI * radius * radius;
            }

            @Override
            public double getPerimeter() {
                return 2 * Math.PI * radius;
            }

            public void print() {
                System.out.println("The area of the circle is: " + getArea());
                System.out.println("The perimeter of the circle is: " + getPerimeter() + "\n");
            }
        };

        circle.print();

        figuresList.add(circle);

        biggestArea = figureController.getMaxArea(figuresList);
        System.out.println("Max area: " + biggestArea.getArea());

        biggestPerimeter = figureController.getMaxPerimeter(figuresList);
        System.out.println("Max perimeter: " + biggestPerimeter.getPerimeter() + "\n");
    }
}