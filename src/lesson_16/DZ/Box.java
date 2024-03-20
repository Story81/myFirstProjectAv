package lesson_16.DZ;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends  Fruit> {

//    Домашнее задание:
//    a. Есть классы Fruit (абстрактный), его наследники —-> Apple, Orange;(больше фруктов не надо)
//    b. Класс Box в который можно складывать фрукты, коробки типизируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
//    c. Для хранения фруктов внутри коробки можете использовать ArrayList;
//    d. Сделать метод getWeight() который высчитывает вес коробки, зная количество фруктов и вес одного фрукта(вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);
//    e. Внутри класса коробка сделать метод compare, который позволяет сравнить текущую коробку с той, которую подадут в compare в качестве параметра, true - если их веса равны, false в противном случае(коробки с яблоками мы можем сравнивать с коробками с апельсинами);
//    f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую коробку(помним про сортировку фруктов, нельзя яблоки высыпать в коробку с апельсинами), соответственно в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в этой коробке;
//    g. Не забываем про метод добавления фрукта в коробку.
    private String name;
    private List <T> boxOfFruit = new ArrayList<T>();
    private float totalWeight = 0;

    public float getWeightOfBox() {
            for (T fruit : boxOfFruit) {
                totalWeight = boxOfFruit.size() * fruit.getWeight();
        }
        return totalWeight;
    }

    public  boolean compare (Box box) {
        if (this.totalWeight == box.totalWeight) {
            return true;
        }
        return false;
    }

    public void intersperseIn(Box<T> box) {
        for (T fruit : boxOfFruit) {
            box.addFruit(fruit);
        }
        boxOfFruit.clear();
        this.totalWeight = 0;
        box.getWeightOfBox();
    }


    public void addFruit (T fruit) {
        boxOfFruit.add(fruit);
    }

    public Box(String name) {
        this.name = name;
    }

    public Box() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<T> getBoxOfFruits() {
        return boxOfFruit;
    }

    public void setBoxOfFruits(List<T> boxOfFruits) {
        this.boxOfFruit = boxOfFruits;
    }

    @Override
    public String toString() {
        return "В коробке с названием '" + name + '\'' + ", лежат фрукты" + boxOfFruit + ", вес коробки = " + totalWeight;
    }
}
