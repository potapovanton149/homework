package ru.courses.main;

import ru.courses.mathematics.Fraction;

public class Main {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(1, 3);
        Fraction fraction2 = new Fraction(1, 3);

        System.out.println(fraction1.hashCode() == fraction2.hashCode()) ;
        System.out.println(fraction1.equals(fraction2));
    }
}
