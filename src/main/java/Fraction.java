public class Fraction extends Number {
    private final int NUMERATOR;
    private final int DENOMINATOR;

    public Fraction(int numerator, int denominator) {
        if (numerator < 0) {
            throw new IllegalArgumentException("Числитель не может быть отрицательным");
        }
        this.NUMERATOR = numerator;
        this.DENOMINATOR = denominator;
    }

    public int getNUMERATOR() {
        return NUMERATOR;
    }

    public int getDENOMINATOR() {
        return DENOMINATOR;
    }

    public Fraction sum(Fraction f) {
        int newDenominator = this.getDENOMINATOR() * f.getDENOMINATOR();
        int newNumerator = this.getNUMERATOR() * f.getDENOMINATOR() +
                f.getNUMERATOR() * this.getDENOMINATOR();
        return new Fraction((newNumerator), newDenominator);
    }

    public Fraction sum(int number) {
        Fraction fraction = new Fraction(number, 1);
        return sum(fraction);
    }

    public Fraction minus(Fraction f) {
        int newDenominator = this.getDENOMINATOR() * f.getDENOMINATOR();
        int newNumerator = this.getNUMERATOR() * f.getDENOMINATOR() -
                f.getNUMERATOR() * this.getDENOMINATOR();
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction minus(int number) {
        Fraction fraction = new Fraction(number, 1);
        return minus(fraction);
    }

    public int intValue() {
        return (int) NUMERATOR / DENOMINATOR;
    }

    public long longValue() {
        return (long) NUMERATOR / DENOMINATOR;
    }

    public float floatValue() {
        return (float) NUMERATOR / DENOMINATOR;
    }

    public double doubleValue() {
        return (double) NUMERATOR / DENOMINATOR;
    }

    @Override
    public String toString() {
        return "{" + NUMERATOR +
                "/" + DENOMINATOR +
                "}";
    }
}