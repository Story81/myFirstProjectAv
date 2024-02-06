package lesson_2;

public class Main3 {

    // Даны 3 стороны треугольника. Вывести на консоль какой это треугольник
    // - равносторонний, равнобедренный, разносторонний.
    //
    public static void main(String[] args) {
        int sideA = 2;
        int sideB = 7;
        int sideC = 5;
        if ((sideA == sideB) && (sideB == sideC)) {
            System.out.println("Это равносторонний треугольник");
        }

        else if ((sideA != sideB)
                && (sideB != sideC)
                && (sideA != sideC)) {
            System.out.println("Это разносторонний треугольник");
        }

        else  {
            System.out.println("Это равнобедренный треугольник");
        }
    }
}
