import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Посчитать f1.sum(f2).sum(f3).minus(5), где f1 это одна треть, f2 две пятых, а f3 это семь восьмых:");

            Fraction f1 = new Fraction(1, 3);
            Fraction f2 = new Fraction(2, 5);
            Fraction f3 = new Fraction(7, 8);


            Fraction fRes = f1.sum(f2).sum(f3).minus(5);
            System.out.println(fRes);

            //Создам число с отрицательным числителем:
            Fraction f4 = new Fraction(-4, 6);
            System.out.println(f4);

            //Пытаемся создать число с отрицательным знаменателем:
            Fraction f5 = new Fraction(2, -3);
            System.out.println(f5);
        } catch (IllegalArgumentException e){
            System.out.println("Поздравляю! Вы получили событие с уровнем ERROR: " + e.getMessage());
        }
    }
}
