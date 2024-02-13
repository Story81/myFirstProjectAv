package lesson_6;

public class Main {
    public static void main(String[] args) {
        Method method = new Method();

        System.out.println("Вызываем 1 метод:");
        System.out.printf("Площадь треугольника равна %.2f\n", method.triangleSquare(2,9,10));

        System.out.println("\nВызываем 2 метод:");

        System.out.printf("Всего в строке %s гласных букв\n", method.numberOfVowels("сколько букв УОИ"));

        System.out.println("\nВызываем 3 метод:");
        method.printRomb(5);

        System.out.println("\nВызываем 4 метод:");
        int array[][] = { { 39, 27, 11, 42 },
                          { 10, 93, 91, 90 },
                          { 54, 78, 56, 89 },
                          { 24, 64, 20, 65 } };

        method.printArray(array);
    }
}
