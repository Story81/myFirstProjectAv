package lesson_3;

public class Main {
    public static void main(String[] args) {
        //тернарный оператор
        int a = 2;
        int b = a > 0 ? 1 : 2;
        System.out.println(b);


        for (int i = 0; i < 5; i++) {
            System.out.println("Привет!");
        }

        //вывести на консоль все чет ный от 10 до 20

//        for (int i = 10; i <= 20; i++) {
//            if (i % 2 == 1) {
//                System.out.println(i);
//            }

//            for (int i = 10; i <= 20; i += 2) {
//
//                    System.out.println(i);
//                }

//        double money = 1_000_000;
//        int year = 5;
//        int rate = 7;
//        for (int i = 0; i < year; i++) {
//            money = money + money * rate / 100;
//        }
//        System.out.printf("%.2f", money);
//
//
//    }
        int c = 1;
        int d = 10;
        int sum=0;
        for (int i = c; i < d; i++) {
            sum = sum + i;

        }
        System.out.println(sum);
    }



    //поситать сумму чисел от а до б


}

