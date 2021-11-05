package OOP.lab5.task3;

public class D extends C {
    public String d;
    protected X x = new X("yyy");

    protected D(String d) {
        super(" from Class C");
        this.d = d;
    }

    @Override
    public String toString() {
        return super.toString() + ", D -" + d;
    }
}
