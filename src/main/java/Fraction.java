public class Fraction {
    /**
     * Из ТЗ "Объекты дробей не могут изменять свое состояние" как я понял, подразумевает поля в виде констант
     */
    private final int NUMERATOR;
    private final int DENOMINATOR;

    /**
     *Под условие из ТЗ "Для знаменателя отрицательное значение недопустимо" добавил исключение.
     * Да, мы это еще не проходили, но мне показалось так будет красивее.
     * Да и в целом если ты не возражаешь я постараюсь использовать то, до чего мы еще по курсу не дошли,
     * но мы с гуглом поняли как это применить.:)
     * По Java больше все зашел этот ресурс: https://metanit.com/java/tutorial/2.10.php
     */
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

    public Fraction sum(Fraction f){
        int newDenominator = this.getDENOMINATOR() * f.getDENOMINATOR();
        int newNumerator = this.getNUMERATOR() * f.getDENOMINATOR() +
                f.getNUMERATOR() * this.getDENOMINATOR();
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
        int newDenominator = this.getDENOMINATOR() * f.getDENOMINATOR();
        int newNumerator = this.getNUMERATOR() * f.getDENOMINATOR() -
                f.getNUMERATOR() * this.getDENOMINATOR();
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction minus(int number){
        Fraction fraction = new Fraction(number, 1);
        return minus(fraction);
    }

    @Override
    public String toString() {
        return "{" + NUMERATOR +
                "/" + DENOMINATOR +
                "}";
    }
}