package oop.lab5.task2;

public class F extends E {
    public String f;

    protected F(String f, X x) {
        super(" from Class E", x);
        this.f = f;
    }

    @Override
    public String toString() {
        return super.toString() + ", F -" + f;
    }
}
