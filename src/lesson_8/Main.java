package lesson_8;


public class Main {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle("Треугольник",3,9,11);
        Rectangle rectangle2 = new Rectangle("Треугольник",3,3,3);
        Square square = new Square("Квадрат", 4);

        rectangle1.perimeter();
        square.perimeter();
    }
}
