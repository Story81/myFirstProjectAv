package lesson_4;

public class Main {
    public static void main(String[] args) {
        //вывести в консоль элементы массива в обратном порядке перескакивая через ячейку
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = arr.length - 1; i >= 0; i -= 2) {
            System.out.println(arr[i]);
        }
        System.out.println();


        //Создать массив символов и вывести в консоль только гласные буквы
        //вариант1
        System.out.println("вариант 1");
        char[] symbols = {'а', 'а', 'в', 'ю', 'ы', 'ы', 'л', 'и'};
        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i] == 'а' || symbols[i] == 'е' || symbols[i] == 'ы' || symbols[i] == 'ю' || symbols[i] == 'о' || symbols[i] == 'э' ||
                    symbols[i] == 'я' || symbols[i] == 'и') {
                System.out.println(symbols[i]);
            }
        }

        //вариант2
        System.out.println("вариант 2");
        char[] symbol = {'а', 'а', 'в', 'ю', 'ы', 'ы', 'л', 'и'};
        char[] glasnwe = {'а', 'е', 'ы', 'а', 'о', 'э', 'я', 'и'};
        for (int k = 0; k < symbols.length; k++) {
            for (int j = 0; j < glasnwe.length; j++) {
                if (glasnwe[j] == symbol[k]) {
                    System.out.println(symbols[k]);
                    break;
                }
            }
        }

        //Задать массив чисел и вывести поочередно для каждого элементы сумму его значения и его соседних элементов
        System.out.println("задача: ");
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int l = 0; l <= array.length-1; l++) {
            if (l==0) {
                System.out.println(array[l]+array[l+1]);
            } else if (l == array.length-1) {
                System.out.println(array[l] + array[l - 1]);
            } else {
                System.out.println(array[l]+array[l+1]+array[l-1]);
            }
        }
        System.out.println("задача: ");
        //есть массив символов  q w e r t т массив a s d f g, необхожимо их объединить в один
        char[] qwert = "qwert".toCharArray();
        char[] asdfg = "asdfg".toCharArray();
        char[] result = new char[qwert.length + asdfg.length];
        for (int i = 0; i < qwert.length; i++) {
            result[i]= qwert[i];
        }
        for (int i = 0; i < asdfg.length; i++) {
            result[i+qwert.length]= asdfg[i];
        }
        System.out.println(result);
    }
}