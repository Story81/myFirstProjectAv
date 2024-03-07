package lesson_12;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class CoinSortUtils {

    public static void printCoinByMetalAsc(Set<Coin> coins) {
        TreeSet<Coin> sortedCoin = new TreeSet<>(new ByMetalAscComparator());
        sortedCoin.addAll(coins);

        System.out.println();
        System.out.println("Коллекция после сортировки по металлу (по возрастанию)");
        for (Coin coin : sortedCoin) {
            System.out.println(coin);
        }
    }
    public  static void printCoinByMetalDesc(Set<Coin> coins) {
        TreeSet<Coin> sortedCoin = new TreeSet<>(new ByMetalAscComparator().reversed());
        sortedCoin.addAll(coins);
        System.out.println();
        System.out.println("Коллекция после сортировки по металлу (по убыванию)");
        for (Coin coin : sortedCoin) {
            System.out.println(coin);
        }
    }

    public static void printCoinByYearAsc(Set<Coin> coins) {
        TreeSet<Coin> sortedCoin = new TreeSet<>(new Comparator<Coin>() {
            @Override
            public int compare(Coin firstCoin, Coin secondCoin) {
                if (firstCoin.getYear()!=secondCoin.getYear()) {
                    return firstCoin.getYear() - secondCoin.getYear();}
                if (!firstCoin.getMetal().equals(secondCoin.getMetal())) {
                    return firstCoin.getMetal().compareTo(secondCoin.getMetal());
                }
                if (firstCoin.getNominal()!=secondCoin.getNominal()) {
                    return firstCoin.getNominal() - secondCoin.getNominal();
                }
                return Double.compare(firstCoin.getDiameter(), secondCoin.getDiameter());
            }
        });
        sortedCoin.addAll(coins);

        System.out.println();
        System.out.println("Коллекция после сортировки по году (по возрастанию )");
        for (Coin coin : sortedCoin) {
            System.out.println(coin);
        }
    }

    public static void printCoinByYearDesc(Set<Coin> coins) {
        TreeSet<Coin> sortedCoin = new TreeSet<>(new Comparator<Coin>() {
            @Override
            public int compare(Coin firstCoin, Coin secondCoin) {
                if (firstCoin.getYear()!=secondCoin.getYear()) {
                    return (-1)*(firstCoin.getYear() - secondCoin.getYear());}
                if (!firstCoin.getMetal().equals(secondCoin.getMetal())) {
                    return firstCoin.getMetal().compareTo(secondCoin.getMetal());
                }
                if (firstCoin.getNominal()!=secondCoin.getNominal()) {
                    return firstCoin.getNominal() - secondCoin.getNominal();
                }
                return Double.compare(firstCoin.getDiameter(), secondCoin.getDiameter());
            }
        });
        sortedCoin.addAll(coins);

        System.out.println();
        System.out.println("Коллекция после сортировки по году (по убыванию )");
        for (Coin coin : sortedCoin) {
            System.out.println(coin);
        }
    }
    public static void printCoinByNominalAsc(Set<Coin> coins) {
        TreeSet<Coin> sortedCoin = new TreeSet<>(new ByNominalAscComparator());
        sortedCoin.addAll(coins);

        System.out.println();
        System.out.println("Коллекция после сортировки по номиналу (по возрастанию)");
        for (Coin coin : sortedCoin) {
            System.out.println(coin);
        }
    }
    public static void printCoinByNominalDesc(Set<Coin> coins) {
        TreeSet<Coin> sortedCoin = new TreeSet<>(new ByNominalAscComparator().reversed());
        sortedCoin.addAll(coins);

        System.out.println();
        System.out.println("Коллекция после сортировки по номиналу (по убыванию)");
        for (Coin coin : sortedCoin) {
            System.out.println(coin);
        }
    }


}
