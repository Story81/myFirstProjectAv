package lesson_7;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("черный", "Бегемот", 3);
        Cat cat2 = new Cat("Васька", "рыжий");
        Cat cat3 = new Cat("серый");


        cat1.myInfo();
        cat2.myInfo();
        cat3.myInfo();

     Cat.myau();
     cat1.myau();

     cat1.feedCat(5);
        cat2.feedCat(-50);
        cat3.feedCat(10);
    }
}
