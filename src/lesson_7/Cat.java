package lesson_7;

public class Cat {
    private String name;
    private int age;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Cat(String color, String name, int age) {
        this.color = color;
        this.name = name;
        this.age = age;

    }

    public Cat(String color) {
        this.color = color;
    }

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void myInfo() {
        if (age == 0 && name != null) {
            System.out.printf("Я %s кот по имени %s\n", color, name);
        } else if (name == null) {
            System.out.printf("Я %s кот\n", color);
        } else {
            System.out.printf("Я %s кот по имени %s, возраст %d года/лет\n", color, name, age);

        }
    }
   public static void myau () {
        System.out.println("мяу мяу");
    }

    public void feedCat(int amount) {
        if (amount >= 10) {
            if (name != null) {
                System.out.printf("Кот %s сытый\n", name);
            } else {
                System.out.println("Кот сытый\n");
            }
        } else if (amount <0){
                System.out.println("ай ай, кормите кота, а не балуйтесь");
        } else {
            if (name != null) {
                System.out.printf("Кот %s все еще голодный\n", name);
            } else {
                System.out.println("Кот все еще голодный\n");
            }
        }
    }
}
