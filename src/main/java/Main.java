import java.util.ArrayList;
import java.util.List;

public class Main {
    public static double sumAll(List<Number> numberList) {
        double sumAll = 0;
        for (Number number : numberList) {
           sumAll += number.doubleValue();
        }
        return sumAll;
    }

    public static void main(String[] args) {
        int number1 = 2;
        Fraction number2 = new Fraction(3, 5);
        double number3 = 2.3;

        List<Number> numberList1 = new ArrayList<>();
        numberList1.add(number1);
        numberList1.add(number2);
        numberList1.add(number3);

        System.out.println(sumAll(numberList1));




        double number4 = 3.6;
        Fraction number5 = new Fraction(49 , 12);
        int number6 = 3;
        Fraction number7 = new Fraction(3, 2);

        List<Number> numberList2 = new ArrayList<>();
        numberList2.add(number4);
        numberList2.add(number5);
        numberList2.add(number6);
        numberList2.add(number7);

        System.out.println(sumAll(numberList2));




        Fraction number8 = new Fraction(1 , 3);
        int number9 = 1;

        List<Number> numberList3 = new ArrayList<>();
        numberList3.add(number8);
        numberList3.add(number9);

        System.out.println(sumAll(numberList3));

    }
}