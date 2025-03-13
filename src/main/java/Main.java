import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        try {
            //Пробуем разные конструкторы и выводим результат

            Square square1 = new Square(new Point(2, 2), 3);
            System.out.println(square1);

            Square square2 = new Square(3, 3, 4);
            System.out.println(square2);

            //В первом квадрате используем сеттер с числами координат. Выводим результат.
            square1.setPoint(5, 5);
            System.out.println(square1);

            //Во втором квадрате используем сеттер с объектом "Точка". Выводим результат.
            square2.setPoint(new Point(5, 5));
            System.out.println(square2);

            //Пробуем установить длину квадрата отрицательным числом
            square1.setSideLength(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("Вы получили событие с уровнем ERROR: " + e.getMessage());
        }
    }
}
