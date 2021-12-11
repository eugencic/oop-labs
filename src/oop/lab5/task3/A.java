package oop.lab5.task3;

public class A {
    protected String a;
    protected X x = new X("xxx");

    protected A(String a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return " A -" + a;
    }
}
