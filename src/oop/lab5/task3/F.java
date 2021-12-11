package oop.lab5.task3;

public class F extends E {
    public String f;

    protected F(String f) {
        super(" from Class E");
        this.f = f;
    }

    @Override
    public String toString() {
        return super.toString() + ", F -" + f;
    }
}
