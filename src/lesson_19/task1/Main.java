package lesson_19.task1;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Honda", "Black");
        Car.Engine engine = car.new Engine(100, "Deiesel");
        car.setEngine(engine);
        System.out.println(car);
        car.printInfo();
        engine.printInfo();
    }
}
