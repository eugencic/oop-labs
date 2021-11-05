package OOP.lab5.task2;

public class D extends C {
    public String d;

    protected D(String d, X x) {
        super(" from Class C", x);
        this.d = d;
    }

    @Override
    public String toString() {
        return super.toString() + ", D -" + d;
    }
}
