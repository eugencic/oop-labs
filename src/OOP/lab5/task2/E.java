package OOP.lab5.task2;

public class E extends D {
    public String e;

    protected E(String e, X x) {
        super(" from Class D", x);
        this.e = e;
    }

    @Override
    public String toString() {
        return super.toString() + ", E -" + e;
    }
}
