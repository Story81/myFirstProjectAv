package lesson_10.task2;

public class Main {
    public static void main(String[] args) {
        IFraction fraction1 = new Fraction(44, 8);
        IFraction fraction2= new Fraction(44, 12);

        IFractionCalc ifractionCalc = new FractionCalc();
        System.out.println(fraction1);
        System.out.println(fraction2);

        System.out.println("\nРезультат сложения :");
        System.out.println(ifractionCalc.sum(fraction1, fraction2));

        System.out.println("\nРезультат вычитания :");
        System.out.println(ifractionCalc.sub(fraction1, fraction2));

        System.out.println("\nРезультат умножения :");
        System.out.println(ifractionCalc.mul(fraction1, fraction2));

        System.out.println("\nРезультат деления :");
        System.out.println(ifractionCalc.div(fraction1, fraction2));
    }
}
