package lesson_19.task3;

import lesson_19.task1.Car;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Car> cars = new TreeSet<>(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getColor().compareTo(o2.getColor());
            }
        });
        cars.add(new Car("Honda", "Black"));
        cars.add(new Car("BMW", "Green"));
        cars.add(new Car("Lada", "White"));
        for (Car car : cars) {
            System.out.println(car);

        }
    }

}
