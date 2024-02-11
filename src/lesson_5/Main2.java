package lesson_5;

import java.util.Scanner;

public class Main2 {
    /*    1. Задать двухмерный массив целых чисел размером 9 х 9.
        Заполнить диагональ массива единицами, как на первой картинке.
        Код должен работать корректно, если поменять размер массива, например 11 х 11.*/
    public static void main(String[] args) {
        int[][] array = new int[9][9];


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i == j)) {
                    array[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Задача 2");
//        2. То же самое, но заполнить единицами обе диагонали, как на второй картинке.
//                Код также должен работать корректно при любом размере массива.
//        Решать с помощью циклов.


        int[][] array1 = new int[9][9];


        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                if ((i == j) || (i + j == array1.length - 1)) {
                    array1[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }


//        3. **Для желающих. Заполнить двумерный массив ромбиком как на третьей картинке.
//        Зелёные поля заполнить единицами, жёлтые - нулями. Массив должен быть квадратным (число строк равно числу столбцов).
//        Размер массива должен быть нечётным. Код должен корректно работать при любом нечётном размере массива.
        System.out.println("Задача 3");

        System.out.println("Введите размер квадратного массива (нечетное число)");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        if (size % 2 != 0) {
            int[][] array2 = new int[size][size];
            int centerIndex = size / 2;

            for (int i = 0; i < array2.length; i++) {
                for (int j = 0; j < array2[i].length; j++) {
                    if ((centerIndex - i == j)) {
                        array2[i][j] = 1;
                    } else if (i - centerIndex == j) {
                        array2[i][j] = 1;
                    } else if (i == j - centerIndex) {
                        array2[i][j] = 1;
                    } else if (i + j == centerIndex * 3) {
                        array2[i][j] = 1;
                    }
                }
            }
            for (int i = 0; i < array2.length; i++) {
                for (int j = 0; j < array2[i].length; j++) {
                    System.out.print(array2[i][j] + " ");
                }
                System.out.println();
            }

        } else {
            System.out.println("!!! Некорректный размер массива. ");
        }
    }
}
