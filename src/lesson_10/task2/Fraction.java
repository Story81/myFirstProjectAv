package lesson_10.task2;

public class Fraction implements IFraction {
    int numerator;
    int denomerator;

    public Fraction(int numerator, int denomerator) {
        if(denomerator==0){
            System.out.println("Знаменатель не может быть равен 0! Знаменатель будет равен 1");
            this.numerator = numerator;
            this.denomerator = 1;
            return;
        }
        this.numerator = numerator;
        this.denomerator = denomerator;
    }


    @Override
    public int getNumerator() {
        return numerator;
    }

    @Override
    public void setNumerator(int value) {
        this.numerator = value;
    }

    @Override
    public int getDenomerator() {
        return denomerator;
    }

    @Override
    public void setDenomerator(int value) {
        this.denomerator = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Fraction fraction = (Fraction) o;

        if (numerator != fraction.numerator) return false;
        return denomerator == fraction.denomerator;
    }

    @Override
    public int hashCode() {
        int result = numerator;
        result = 31 * result + denomerator;
        return result;
    }

    @Override
    public String toString() {
        return "Простая дробь "+ numerator + "/" + denomerator;
    }
}
