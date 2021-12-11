package oop.lab5.task3;

public class H extends G {
    public String h;
    private X x = new X("zzz");

    protected H(String h) {
        super(" from Class G");
        this.h = h;
    }

    protected X getX() {
        return x;
    }

    @Override
    public String toString() {
        return super.toString() + ", H -" + h;
    }
}
