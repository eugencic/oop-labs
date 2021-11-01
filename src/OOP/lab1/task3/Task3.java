package OOP.lab1.task3;
import java.util.Scanner;

public class Task3 {
    public static double getAverage(University university) {
        double sum = 0;
        int NumberOfStudents = university.students.length;

        for (int i = 0; i < NumberOfStudents; i++) {
            sum = sum + university.students[i].mark;
        }

        double average = sum / NumberOfStudents;
        return average;
    }

    public static void universities(University university) {
        Scanner input = new Scanner(System.in);
        System.out.println ("Enter the number of students studying in " + university.name + ":");
        int NumberOfStudents = input.nextInt(); input.nextLine();
        university.students =  new Student[NumberOfStudents] ;
        for (int i = 0; i < NumberOfStudents; i++) {
            Student student = new Student();
            university.students[i] = student;
            System.out.println("Enter the student " + (i+1) +" name:");
            student.name = input.nextLine();
            System.out.println("Enter the student " + (i+1) +" age:");
            student.age = input.nextInt();
            System.out.println("Enter the student " + (i+1) +" mark:");
            student.mark = input.nextInt(); input.nextLine();
        }
    }

    public static void main(String[] args) {
        University university1 = new University();
        university1.name = "USM";
        university1.year = 1946;
        universities(university1);
        double average1 = getAverage(university1);
        System.out.println ("The average media of " + university1.name + " is: " + average1);

        University university2 = new University();
        university2.name = "UTM";
        university2.year = 1964;
        universities(university2);
        double average2 = getAverage(university2);
        System.out.println ("The average media of " + university2.name + " is: " + average2);

        University university3 = new University();
        university3.name = "UAIC";
        university3.year = 1933;
        universities(university3);
        double average3 = getAverage(university3);
        System.out.println ("The average media of " + university3.name + " is: " + average3);

        double total = average1 + average2 + average3;
        double averageTotal = total/3;
        System.out.println ("The average media of all universities is: " + averageTotal);
    }
}