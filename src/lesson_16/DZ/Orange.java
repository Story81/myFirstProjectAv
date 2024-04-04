package lesson_16.DZ;

public class Orange extends Fruit {
    private static final float weight = 1.5f;
    private String name;

    public Orange(String name) {
        this.name = name;
    }

    public Orange() {
    }

    public float getWeight() {
        return weight;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  name;
    }
}
