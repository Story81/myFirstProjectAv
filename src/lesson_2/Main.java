package lesson_2;

public class Main {
    /**
     * Даны переменные:
     * - деньги, которые у нас есть - 1000 рублей
     * - стоимость пиццы - 230 рублей
     * - стоимость шоколадки - 22 рубля
     * - стоимость конфеты - 2,5 рубля
     * Задача: представим себе, что мы зашли в магазин, и наша задача: купить максимальное количество пиццы,
     * затем на сдачу купить максимальное количество шоколадок, затем на оставшуюся сдачу купить максимальное количество конфет.
     * В результате нам нужно сделать математический просчет и вывести на консоль информацию в таком формате:
     * На эти деньги мы можем купить:
     * - пицца - х шт.
     * - шоколадки - х шт.
     * - конфеты - х шт.
     * Сдача: х руб.
     */
    public static void main(String[] args) {
        double allMoney = 1000;
        double costOfPizza = 230;
        double costOfChocolate = 22;
        double costOfCandy = 2.5;

        int quantityOfPizza = (int) (allMoney / costOfPizza);
        int quantityOfChocolate = (int) ((allMoney - (quantityOfPizza * costOfPizza)) / costOfChocolate);
        int quantityOfCandy = (int) (((allMoney - (quantityOfPizza * costOfPizza) - (quantityOfChocolate * costOfChocolate))) / costOfCandy);
        double change = (allMoney - (quantityOfPizza * costOfPizza) - (quantityOfChocolate * costOfChocolate) - (quantityOfCandy * costOfCandy));

        System.out.println(
                "На эти деньги мы можем купить:\n" +
                        " - пицца - " + quantityOfPizza + " шт.\n" +
                        " - шоколадки - " + quantityOfChocolate + " шт.\n" +
                        " - конфеты - " + quantityOfCandy + " шт.\n" +
                        " Сдача: " + change + " руб."
        );
    }
}

