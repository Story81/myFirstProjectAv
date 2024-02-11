package lesson_5;

import java.util.Scanner;

public class Main {

    //Цикл DO WHILE
    // с помощью двумерного массива нарисовать шахматную доску. Черные клеинтки -1, белые - 0

    public static void main(String[] args) {
        int[][] array = new int[8][8];
        int num = 1;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i+j)%2==0) {
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

        //Нужно сравнить введенный пароль с заданный
        String pas = "qwe";
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.println("Введите пароль: ");
            input = scanner.nextLine();

        } while (!input.equals(pas));
        System.out.println("Успешный вход");


        //Газовикам нужно обойти все квартиры и проверить оборудование.
        //Домой 3, этажей 5, по 4 кв на этаже

        for (int house = 1; house<=3; house++){
            num = 1;
            for (int floor = 1; floor <=5 ; floor++) {
                for (int flat = 1; flat <=4 ; flat++) {
                    System.out.printf("Проверено оборудование в доме %d на этаже %d  в квартире %d \n", house, floor, num);
                    num++;
                }
            }
        }
    }
}
