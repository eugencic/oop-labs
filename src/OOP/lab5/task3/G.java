package OOP.lab5.task3;

public class G extends F {
    public String g;

    protected G(String g) {
        super(" from Class F");
        this.g = g;
    }

    @Override
    public String toString() {
        return super.toString() + ", G -" + g;
    }
}
