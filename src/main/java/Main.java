import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Fraction fraction = new Fraction(10, 3);
        System.out.println(fraction.doubleValue());
        System.out.println(fraction.floatValue());
        System.out.println(fraction.longValue());
        System.out.println(fraction.intValue());
    }
}