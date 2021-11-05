package OOP.lab5.task2;

public class J extends I {
    public String j;

    protected J(String j, X x) {
        super(" from Class I", x);
        this.j = j;
    }

    @Override
    public String toString() {
        return super.toString() + ", J -" + j;
    }
}
