package oop.lab5.task3;

public class I extends H {
    public String i;

    protected I(String i) {
        super(" from Class H");
        this.i = i;
    }

    @Override
    public String toString() {
        return super.toString() + ", I -" + i;
    }
}
