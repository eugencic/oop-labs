package oop.lab5.task2;

public class G extends F {
    public String g;

    protected G(String g, X x) {
        super(" from Class F", x);
        this.g = g;
    }

    @Override
    public String toString() {
        return super.toString() + ", G -" + g;
    }
}
