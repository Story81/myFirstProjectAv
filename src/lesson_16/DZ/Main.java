package lesson_16.DZ;

import java.util.List;

public class Main {
    //
//    Домашнее задание:
//    a. Есть классы Fruit (абстрактный), его наследники —-> Apple, Orange;(больше фруктов не надо)
//    b. Класс Box в который можно складывать фрукты, коробки типизируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
//    c. Для хранения фруктов внутри коробки можете использовать ArrayList;
//    d. Сделать метод getWeight() который высчитывает вес коробки, зная количество фруктов и вес одного фрукта(вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);
//    e. Внутри класса коробка сделать метод compare, который позволяет сравнить текущую коробку с той, которую подадут в compare в качестве параметра, true - если их веса равны, false в противном случае(коробки с яблоками мы можем сравнивать с коробками с апельсинами);
//    f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую коробку(помним про сортировку фруктов, нельзя яблоки высыпать в коробку с апельсинами), соответственно в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в этой коробке;
//    g. Не забываем про метод добавления фрукта в коробку.
    public static void main(String[] args) {
        Apple apple1 = new Apple("яблоко зеленое");
        Apple apple2 = new Apple("яблоко красное");
        Orange orange1 = new Orange("апельсин");
        Orange orange2 = new Orange("апельсин красный");

        Box<Apple> box1 = new Box("коробка1");
        Box<Orange> box2 = new Box("коробка2");
        Box<Orange> box3 = new Box("коробка3");

        box1.addFruit(apple1);
        box1.addFruit(apple2);
        box1.addFruit(apple2);
        box2.addFruit(orange1);
        box2.addFruit(orange1);
        box2.addFruit(orange1);
        box2.addFruit(orange1);
        box3.addFruit(orange2);
        box3.addFruit(orange2);

        System.out.println(box1.getName() + " весом = "+box1.getWeightOfBox());
        System.out.println(box2.getName() + " весом = "+box2.getWeightOfBox());
        System.out.println(box3.getName() + " весом = "+box3.getWeightOfBox());


        System.out.println("\nСравнение:  "+ box3.getName()+ " с весом "+ box3.getWeightOfBox()+ " и "+ box1.getName()+
                " с весом "+ box1.getWeightOfBox()+ " =  "+ box3.compare(box1));

        System.out.println("\nДо пересыпания:");
        System.out.println(box1);
        System.out.println(box2);
        System.out.println(box3);
        box2.intersperseIn(box3);
        System.out.println("\nПосле пересыпания:");
        System.out.println(box2);
        System.out.println(box3);

    }
}



