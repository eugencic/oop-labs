package OOP.lab5.task2;

public class A {
    protected String a;
    protected X x;

    protected A(String a, X x) {
        this.a = a;
        this.x = x;
    }

    @Override
    public String toString() {
        return "X =" + x.toString() + ", A -" + a;
    }
}
