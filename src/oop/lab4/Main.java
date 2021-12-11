package oop.lab4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void readFile(String file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while((line = reader.readLine()) != null) {
            System.out.println("\nExpression: " + line);
            System.out.println(ExpressionChecker.checkBrackets(line));
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("\nFile one_expression.txt");
        readFile("src/OOP/lab4/one_expression.txt");
        System.out.println("\nFile three_expressions.txt");
        readFile("src/OOP/lab4/three_expressions.txt");
    }
}
