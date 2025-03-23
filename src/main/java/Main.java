import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static double sumAll(List<Object> list) {
        double sumAll = 0;
        for (Object object : list) {
            if (object instanceof Fraction) {
                Fraction fraction = (Fraction) object;
                sumAll += fraction.doubleValue();
            } else if (object instanceof Integer) {
                sumAll += (Integer) object;
            } else if (object instanceof Double) {
                sumAll += (Double) object;
            }
        }
        return sumAll;
    }

    public static void main(String[] args) {
        int number1 = 2;
        Fraction number2 = new Fraction(3, 5);
        double number3 = 2.3;

        List<Object> objectList1 = new ArrayList<>();
        objectList1.add(number1);
        objectList1.add(number2);
        objectList1.add(number3);

        System.out.println(sumAll(objectList1));




        double number4 = 3.6;
        Fraction number5 = new Fraction(49 , 12);
        int number6 = 3;
        Fraction number7 = new Fraction(3, 2);

        List<Object> objectList2 = new ArrayList<>();
        objectList2.add(number4);
        objectList2.add(number5);
        objectList2.add(number6);
        objectList2.add(number7);

        System.out.println(sumAll(objectList2));




        Fraction number8 = new Fraction(1 , 3);
        int number9 = 1;

        List<Object> objectList3 = new ArrayList<>();
        objectList3.add(number8);
        objectList3.add(number9);

        System.out.println(sumAll(objectList3));

    }
}