package lesson_12;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Coin coin1 = new Coin(10,1921, 15, "Золото");
        Coin coin2 = new Coin(25,1995, 30, "Сталь");
        Coin coin3 = new Coin(25,1946, 12, "Сталь");
        Coin coin4 = new Coin(20,1935, 25, "Бронза");
        Coin coin5 = new Coin(10,1919, 19, "Золото");
        Coin coin6 = new Coin(50,1999, 20, "Серебро");
        Coin coin7 = new Coin(5,1969, 20, "Сталь");

        Set<Coin> coins = new HashSet<>();
        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);
        coins.add(coin6);
        coins.add(coin7);

        System.out.println("Коллекция до сортировки");
        for (Coin coin : coins) {
            System.out.println(coin);
        }

        CoinSortUtils.printCoinByMetalAsc(coins);
        CoinSortUtils.printCoinByMetalDesc(coins);
        CoinSortUtils.printCoinByYearAsc(coins);
        CoinSortUtils.printCoinByYearDesc(coins);
        CoinSortUtils.printCoinByNominalAsc(coins);
        CoinSortUtils.printCoinByNominalDesc(coins);
    }
}
