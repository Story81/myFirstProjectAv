package lesson_16.DZ;

public class Apple extends Fruit {
    private final float weight = 1.0f;

    private String name;

    public Apple(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return name;
    }
}
