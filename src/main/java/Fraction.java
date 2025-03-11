public class Fraction {
    /**
     * Из ТЗ "Объекты дробей не могут изменять свое состояние" как я понял, подразумевает поля в виде констант
     */
    private final int numerator;
    private final int denominator;

    /**
     *Под условие из ТЗ "Для знаменателя отрицательное значение недопустимо" добавил исключение.
     * Да, мы это еще не проходили, но мне показалось так будет красивее.
     * Да и в целом если ты не возражаешь я постараюсь использовать то, до чего мы еще по курсу не дошли,
     * но мы с гуглом поняли как это применить.:)
     * По Java больше все зашел этот ресурс: https://metanit.com/java/tutorial/2.10.php
     */
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
    /**
     * Очевидно, что условие из ТЗ "с другой Дробью или целым числом" подразумевает перегрузку методов.
     * При этом я помню твое наставление "переиспользуй код". Попробовал вызвать метод внутри метода и это сработало.
     * Для метода minus сделал идентично.
     *
     * @param number принимаем целочисленное
     * @return возвращаем результат в виде вызова метода sum с аргументом объекта класса Fraction
     */
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