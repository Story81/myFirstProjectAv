package lesson_8;


public class Main {
    public static void main(String[] args) {

        Triangle triangle1 = new Triangle("Треугольник",3,9,11);
        Triangle triangle2 = new Triangle("Треугольник",3,9,11);
        Square square = new Square("Квадрат", 4);
        Rectangle rectangle = new Rectangle("Прямоугольник", 3, 8);


        System.out.println("Дано: ");
        System.out.println(triangle1);
        System.out.println(square);
        System.out.println(rectangle);

        System.out.println("\nВычисления: ");
        triangle1.perimeter();
        square.perimeter();
        rectangle.perimeter();

        System.out.println("\nРавенства: ");
        System.out.println("triangle1 равен triangle2? - " +  triangle1.equals(triangle2));
        System.out.println("square равен triangle2? - " +  square.equals(triangle2));

    }
}
