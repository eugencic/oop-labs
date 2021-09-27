package OOP.lab1.task2;

public class Task2 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Vasile";
        student1.age = 20;
        student1.mark = 9.2;
        Student student2 = new Student();
        student2.name = "Doina";
        student2.age = 19;
        student2.mark = 8.33;
        Student student3 = new Student();
        student3.name = "Ion";
        student3.age = 21;
        student3.mark = 7.45;
        Student student4 = new Student();
        student4.name = "Dan";
        student4.age = 20;
        student4.mark = 8.75;
        Student student5 = new Student();
        student5.name = "Irina";
        student5.age = 24;
        student5.mark = 7.4;
        Student student6 = new Student();
        student6.name = "Marcel";
        student6.age = 25;
        student6.mark = 5.49;

        University university1 = new University();
        university1.name = "USM";
        university1.year = 1946;
        university1.students = new Student[]{student1, student3};
        University university2 = new University();
        university2.name = "UTM";
        university2.year = 1964;
        university2.students = new Student[]{student2, student4};
        University university3 = new University();
        university3.name = "UAIC";
        university3.year = 1933;
        university3.students = new Student[]{student5, student6};
    }
}



