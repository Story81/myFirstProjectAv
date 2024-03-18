package lesson_15;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtilsImp implements StringUtils {


    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {
        double num1 = 0;
        double num2 = 0;
        if (number1 == null || number2 == null) {
            throw new NullPointerException("Ошибка: одно из чисел null");
        }
        try {
            num1 = Double.parseDouble(number1);
            num2 = Double.parseDouble(number2);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Ошибка: Введены не числа");
        }
        if (num2 == 0) {
            throw new ArithmeticException("Ошибка: делить на ноль нельзя");
        }
        return num1 / num2;
    }


//    @Override
//    public int[] findWord(String text, String word) throws NullPointerException {
//        if (text == null || word == null) {
//            throw new NullPointerException("один из вводимых параметров (слово или текст) null");
//        }
//        ArrayList<Integer> indexList = new ArrayList<>();
//        String[] words = text.split(" ");
//
//        for (int j = 0; j < words.length; j++) {
//            if (words[j].equalsIgnoreCase(word)) {
//                indexList.add(j);
//            }
//        }
//
//        int[] indexListArray = new int[indexList.size()];
//        for (int i = 0; i < indexListArray.length; i++) {
//            indexListArray[i] = indexList.get(i);
//        }
//        return indexListArray;
//    }


    @Override
    public double[] findNumbers(String text) throws CustomException {
        ArrayList<String> numbersList = new ArrayList<>();
        Pattern doubleFromString = Pattern.compile("-?\\d+(\\.\\d+)?");

        Matcher m = doubleFromString.matcher(text);

        while (m.find()) {
            numbersList.add(m.group());
        }

        double[] numbersArr = new double[numbersList.size()];
        for (int j = 0; j < numbersArr.length; j++) {
            numbersArr[j] = Double.parseDouble(numbersList.get(j));
        }
        if (numbersList.isEmpty()) {
            throw new CustomException("Ошибка: чисел в строке не обнаружено");
        }
        return numbersArr;
    }

    @Override
    public int[] findWord(String text, String word) throws NullPointerException {
        if (text == null || word == null) {
            throw new NullPointerException("один из вводимых параметров (слово или текст) null");
        }
        ArrayList<Integer> indexList = new ArrayList<>();

        String[] words = text.split(" ");
        int count = 0;

        for (int j = 0; j < words.length; j++) {
            count = count + words[j].length() + 1;
            if (words[j].equalsIgnoreCase(word)) {
                int a = count-words[j].length() - 1;
                indexList.add(a);
            }
        }
        int[] indexListArray = new int[indexList.size()];
        for (int i = 0; i < indexListArray.length; i++) {
            indexListArray[i] = indexList.get(i);
        }
        return indexListArray;
    }
}
