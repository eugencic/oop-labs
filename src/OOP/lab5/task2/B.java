package OOP.lab5.task2;

public class B extends A {
    protected String b;

    protected B(String b, X x) {
        super(" from Class A", x);
        this.b = b;
    }

    @Override
    public String toString() {
        return super.toString() + ", B -" + b;
    }
}
