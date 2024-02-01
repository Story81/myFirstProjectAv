package lesson_1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world!!!");
        int a;
        a = 7;
        double d = 1.3;
        String s = "ва";

        /**
         * задача
         *        * длмна комнаты -12 метров , ширина комнаты - 7 метров
         *        * длина стола 3 метра, ширина стола - 2 метра
         *        * сколько столов войдет в комнату
         */

        int roomLength = 12;
        int roomWidth = 7;
        int tableLength = 3;
        int tableWidth = 2;
        int tablesAtLength = roomLength / tableLength;
        int tablesAtWidth = roomWidth / tableWidth;
        int tablesCount = tablesAtLength * tablesAtWidth;
        System.out.println("Всего в комнату войдет " +tablesCount + " столов");

        boolean b = true;
        System.out.println(b);

        char c ='w';
        char c2 = 465;
        System.out.println(c);
        System.out.println(c2);
    }
}
