package lesson_15;

public class Main {
    public static void main(String[] args) throws CustomException {

        StringUtilsImp stringUtilsImp = new StringUtilsImp();

        try {
            String number1 = "25";
            String number2 = "вава";
            System.out.println("1. Результат вычисления: ");
            System.out.println(stringUtilsImp.div(number1, number2)); }
        catch (ArithmeticException | NullPointerException | NumberFormatException e){
            System.out.println(e.getMessage());
        }


        try {
            String text = "Во поле код Код береза стояла коД во поле кудрявая стояла код";

            String word = "код";
            int[] arr = stringUtilsImp.findWord(text, word);
            System.out.print("2. Индексы вхождения слова " + word + " : ");
            for (int i : arr) {
                System.out.print(i + ", ");
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }


//        String text = "text исхw3.0дный т235екст -2/3  kjk9-9.0";
        String text = "Во поле код Код береза стояла коД во поле кудрявая стояла код";
        try {
            System.out.print("\n3. В строке '" + text + "' содержатся Double :");
            double[] arr = stringUtilsImp.findNumbers(text);
            for (double i : arr) {
                System.out.print(i + ", ");
            }
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}
