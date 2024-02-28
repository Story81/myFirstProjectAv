package lesson_10.task2;

public class FractionCalc implements  IFractionCalc {
    @Override
    public Fraction sum(IFraction fraction, IFraction fraction1) {

        if (fraction.getDenomerator() == fraction1.getDenomerator()) {
            int newNumerator = fraction.getNumerator() + fraction1.getNumerator();
            for (int i = newNumerator; i >= 1; i--) {
                if (newNumerator % i == 0 && fraction.getDenomerator() % i == 0) {
                    return new Fraction(newNumerator / i, fraction.getDenomerator() / i);
                }
            }
        }
        for (int i = 1; i <= fraction.getDenomerator() * fraction1.getDenomerator(); i++) {
            if (i % fraction.getDenomerator() == 0 && i % fraction1.getDenomerator() == 0) {
                int newNumerator = ((i / fraction.getDenomerator()) * fraction.getNumerator()) + ((i / fraction1.getDenomerator()) * fraction1.getNumerator());
                for (int j = newNumerator; j >= 1; j--) {
                    if (newNumerator % j == 0 && fraction.getDenomerator() % j == 0) {
                        return new Fraction(newNumerator / j, i / j);
                    }
                }
            }
        }
        return null;
    }

    @Override
    public Fraction sub(IFraction fraction, IFraction fraction1) {
        if (fraction.getDenomerator() == fraction1.getDenomerator()) {
            int newNumerator = fraction.getNumerator() - fraction1.getNumerator();
            for (int i = newNumerator; i >= 1; i--) {
                if (newNumerator % i == 0 && fraction.getDenomerator() % i == 0) {
                    return new Fraction(newNumerator / i, fraction.getDenomerator() / i);
                }
            }
        }
        for (int i = 1; i <= fraction.getDenomerator() * fraction1.getDenomerator(); i++) {
            if (i % fraction.getDenomerator() == 0 && i % fraction1.getDenomerator() == 0) {
                int newNumerator = ((i / fraction.getDenomerator()) * fraction.getNumerator()) - ((i / fraction1.getDenomerator()) * fraction1.getNumerator());
                for (int j = newNumerator; j >= 1; j--) {
                    if (newNumerator % j == 0 && fraction.getDenomerator() % j == 0) {
                        return new Fraction(newNumerator / j, i / j);
                    }
                }
            }
        }
        return null;
    }

    @Override
    public Fraction mul(IFraction fraction, IFraction fraction1) {
        int newNumerator = fraction.getNumerator() * fraction1.getNumerator();
        int newDenomerator = fraction.getDenomerator() * fraction1.getDenomerator();
        for (int i = newNumerator; i >= 1; i--) {
            if (newNumerator % i == 0 && newDenomerator % i == 0) {
                return new Fraction(newNumerator / i, newDenomerator / i);
            }
        }
        return new Fraction(newNumerator, newDenomerator);
    }


    @Override
    public Fraction div(IFraction fraction, IFraction fraction1) {
        int newNumerator = fraction.getNumerator() * fraction1.getDenomerator();
        int newDenomerator = fraction.getDenomerator() * fraction1.getNumerator();
        for (int i = newNumerator; i >= 1; i--) {
            if (newNumerator % i == 0 && newDenomerator % i == 0) {
                return new Fraction(newNumerator / i, newDenomerator / i);
            }
        }
        return new Fraction(newNumerator, newDenomerator);
    }

//    public Fraction socrachenie ( IFraction fraction) {
//        for (int i = fraction.getNumerator(); i >= 1; i--) {
//            if (fraction.getNumerator() % i == 0 && fraction.getDenomerator() % i == 0) {
//               return new Fraction(fraction.getNumerator() / i, fraction.getDenomerator() / i);
//            }
//        }
//        return null;
//    }
}



