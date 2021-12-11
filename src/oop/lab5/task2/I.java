package oop.lab5.task2;

public class I extends H {
    public String i;

    protected I(String i, X x) {
        super(" from Class H", x);
        this.i = i;
    }

    @Override
    public String toString() {
        return super.toString() + ", I -" + i;
    }
}
