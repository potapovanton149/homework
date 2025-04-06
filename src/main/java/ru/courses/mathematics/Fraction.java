package ru.courses.mathematics;

import java.util.Objects;

public class Fraction extends Number {
    private final int numerator;
    private final int denominator;

    public Fraction(int numerator, int denominator) {
        if (numerator < 0) {
            throw new IllegalArgumentException("Числитель не может быть отрицательным");
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

    public int intValue(){
        return numerator / denominator;
    }

    public long longValue(){
        return numerator / denominator;
    }

    public float floatValue(){
        return numerator / denominator;
    }

    public double doubleValue(){
        return (double) numerator / denominator;
    }

    @Override
    public String toString() {
        return "{" + numerator +
                "/" + denominator +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Fraction fraction = (Fraction) o;
        return numerator == fraction.numerator && denominator == fraction.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }
}