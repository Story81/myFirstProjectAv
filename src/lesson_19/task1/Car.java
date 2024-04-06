package lesson_19.task1;

public class Car {
    private String vendor;
    private String color;
    private Engine engine;
// вариант 1
    public Car(String vendor, String color, Engine engine) {
        this.vendor = vendor;
        this.color = color;
        this.engine = engine;
    }

    //вариант 2
//
//    public Car(String vendor, String color, int horsePower, String type) {
//     this.vendor = vendor;
//     this.color = color;
//     engine = new Engine(horsePower, type);
//     }

    public  void printInfo(){
        System.out.println("Характеристики автомобиля: ");
        System.out.println("Производитель " + vendor);
        System.out.println("Цвет " + color);
        System.out.println("Мощность " + engine.horsePower);
    }

    public Car(String vendor, String color) {
        this.vendor = vendor;
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public  class Engine{
        private int horsePower;
        private String type;

        public  void  printInfo(){
            System.out.println("цвет машины" + color);
        }

        public Engine(int horsePower, String type) {
            this.horsePower = horsePower;
            this.type = type;
        }


        @Override
        public String toString() {
            return "Engine{" +
                    "horsePower=" + horsePower +
                    ", type='" + type + '\'' +
                    '}';
        }
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "vendor='" + vendor + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}
