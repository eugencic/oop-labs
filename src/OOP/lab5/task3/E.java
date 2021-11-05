package OOP.lab5.task3;

public class E extends D {
    public String e;

    protected E(String e) {
        super(" from Class D");
        this.e = e;
    }

    @Override
    public String toString() {
        return super.toString() + ", E -" + e;
    }
}
