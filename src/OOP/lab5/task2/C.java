package OOP.lab5.task2;

public class C extends B {
    protected String c;

    protected C(String c, X x) {
        super(" from Class B", x);
        this.c = c;
    }

    @Override
    public String toString() {
        return super.toString() + ", C -" + c;
    }
}
