package lesson_4;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        //Пользователь вводит пароль. Пароль должен обязательно содержать хотя бы 1 цифру

        System.out.println("Введите пароль");
        Scanner scan = new Scanner(System.in);
        String password = scan.nextLine();
        char[] pass = password.toCharArray();
        for (int i = 0; i < pass.length; i++) {
            if (pass[i]=='1'||pass[i]=='2'||pass[i]=='3'||pass[i]=='4'||pass[i]=='5'||pass[i]=='6') {
                System.out.println("Пароль содержит цифру");
                return;
            }
        }
        System.out.println("Пароль НЕ сoдержит цифру");


    }
}
