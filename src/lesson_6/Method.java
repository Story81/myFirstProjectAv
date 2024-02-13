package lesson_6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Method {
    //    1) Метод должен вывести на консоль площадь треугольника, передаём в метод три стороны
// Формула Герона: S = sqrt (p * (p - a) * (p - b) * (p - c))
    public double triangleSquare(double a, double b, double c) {
        if (!((a + b) > c) || !((a + c) > b) || !((c + b) > a)) {
            System.out.println("!!! Треугольника c такими сторонами не существует");
            return 0;
        } else {
            double p = (a + b + c) / 2;
            return Math.sqrt((p * (p - a) * (p - b) * (p - c)));
        }
    }

// 2) Метод должен вернуть кол-во гласных букв в тексте, который мы передаём входящим параметром

    public int numberOfVowels(String s) {

        Pattern vowels = Pattern.compile("(?iu)[аеёиоуыэюя]");

        Matcher m = vowels.matcher(s);
        int vowelCounter = 0;
        while (m.find()) {
            vowelCounter++;
        }
        return vowelCounter;
    }

//    3) Метод должен печатать на консоль фигуру ромба, ориентируясь на входящий параметр - размер массива (массив квадратный).
//    Если передан чётный размер массива, ромб не должен выводиться, вместо этого должно выводиться сообщение об ошибке.


    public void printRomb(int size) {
        int[][] rhombus = new int[size][size];
        if (size % 2 != 0) {
            int startIndex = rhombus.length / 2;
            int endIndex = rhombus.length / 2;
            for (int i = 0; i < rhombus.length; i++) {
                for (int j = 0; j < rhombus[0].length; j++) {
                    if (j >= startIndex && j <= endIndex) {
                        rhombus[i][j] = 1;
                    }
                }
                if (i < rhombus.length / 2) {
                    startIndex--;
                    endIndex++;
                } else {
                    startIndex++;
                    endIndex--;
                }
            }
            for (int i = 0; i < rhombus.length; i++) {
                for (int j = 0; j < rhombus[0].length; j++) {
                    System.out.print(rhombus[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("!!! Некорректный размер массива ");
        }
    }

    //    4) Метод должен печатать на консоль двухмерный массив, который мы передали в метод входящим параметром
    public void printArray(int array[][]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
