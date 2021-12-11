package oop.lab5.task3;

public class B extends A {
    protected String b;

    protected B(String b) {
        super(" from Class A");
        this.b = b;
    }

    @Override
    public String toString() {
        return super.toString() + ", B -" + b;
    }
}
