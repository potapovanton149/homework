public class Fraction {
    private final int numerator;
    private final int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator < 0) {
            throw new IllegalArgumentException("Знаменатель не может быть отрицательным");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public Fraction sum(Fraction f){
        int newDenominator = this.getDenominator() * f.getDenominator();
        int newNumerator = this.getNumerator() * f.getDenominator() +
                f.getNumerator() * this.getDenominator();
        return new Fraction((newNumerator), newDenominator);
    }

    public Fraction sum(int number){
        Fraction fraction = new Fraction(number, 1);
        return sum(fraction);
    }

    public Fraction minus(Fraction f){
        int newDenominator = this.getDenominator() * f.getDenominator();
        int newNumerator = this.getNumerator() * f.getDenominator() -
                f.getNumerator() * this.getDenominator();
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction minus(int number){
        Fraction fraction = new Fraction(number, 1);
        return minus(fraction);
    }

    @Override
    public String toString() {
        return "{" + numerator +
                "/" + denominator +
                "}";
    }
}