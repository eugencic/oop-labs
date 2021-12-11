package oop.lab5.task3;

public class C extends B {
    protected String c;

    protected C(String c) {
        super(" from Class B");
        this.c = c;
    }

    @Override
    public String toString() {
        return super.toString() + ", C -" + c;
    }
}
