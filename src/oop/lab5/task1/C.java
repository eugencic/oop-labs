package oop.lab5.task1;

public class C extends B {
    public String c;

    C() {
        this.c = " from Class C";
    }

    @Override
    public String toString() {
        return this.c;
    }
}
