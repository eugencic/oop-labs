package OOP.lab5.task2;

public class H extends G {
    public String h;

    protected H(String h, X x) {
        super(" from Class G", x);
        this.h = h;
    }

    @Override
    public String toString() {
        return super.toString() + ", H -" + h;
    }
}
