package lesson_4;

import java.util.Arrays;

public class Main_3 {
    public static void main(String[] args) {
//        1) Сколько в массиве четных чисел?

        System.out.println("Задача 1:");
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int count = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        System.out.printf("всего %d четных чисел\n", count);

        //        2) Все числа из массива, которые больше 10, но меньше 25.
        System.out.println("Задача 2:");

        int[] array = {1, 20, 3, 40, 5, 16, 25, 17, 9, 10};
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] < 25 && array[i] > 10) {
                System.out.print(array[i] + " ");
            }
        }

        //        3) Все числа в обратном порядке. При этом дважды вывести те числа, которые являются кратными трём.
        System.out.println("\nЗадача 3:");
        int[] arrayInt = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = arrayInt.length - 1; i >= 0; i--) {
            if (arrayInt[i] % 3 == 0) {
                System.out.print(arrayInt[i] + " "+arrayInt[i] + " ");
            } else {
                System.out.print(arrayInt[i] + " ");
            }
        }
        //        4) *** По желанию. Вывести только те числа, которые содержат в себе символ 4.
        System.out.println("\nЗадача 4:");
        int[] arrayChars = {1, 2, 43, 4, 5, 6, 74, 8, 9, 104};
//        String[] arrayStr = new String[arrayChars.length];
        for (int i = 0; i <=arrayChars.length -1; i++) {
            String number = String.valueOf(arrayChars[i]);
            if (number.contains("4")) {
                System.out.print(number + " ");
            }
        }
    }
}




