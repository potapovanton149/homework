import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Посчитать f1.sum(f2).sum(f3).minus(5), где f1 это одна треть, f2 две пятых, а f3 это семь восьмых:");

            Fraction f1 = new Fraction(1, 3);
            Fraction f2 = new Fraction(2, 5);
            Fraction f3 = new Fraction(7, 8);
            /**
             * По условию в ТЗ падаем в исключение, так как число отрицательное. Надеюсь, что так и задумано)
             */
            Fraction fRes = f1.sum(f2).sum(f3).minus(5);
            System.out.println(fRes);

        } catch (IllegalArgumentException e){
            System.out.println("Поздравляю! Вы получили событие с уровнем ERROR:" + e.getMessage());
        }
    }
}
