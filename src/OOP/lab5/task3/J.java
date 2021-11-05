package OOP.lab5.task3;

public class J extends I {
    public String j;

    protected J(String j) {
        super(" from Class I");
        this.j = j;
    }

    @Override
    public String toString() {
        return " X = " + getX().toString() + super.toString() + ", J -" + j;
    }
}
