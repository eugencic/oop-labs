package oop.lab5.task1;

public class B extends A {
    public String b;

    B() {
        this.b = " from Class B";
    }

    @Override
    public String toString() {
        return this.b;
    }
}

