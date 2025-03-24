import ru.courses.birds.Bird;
import ru.courses.birds.Cuckoo;
import ru.courses.birds.Parrot;
import ru.courses.birds.Sparrow;
import ru.courses.geometry.Circle;
import ru.courses.geometry.Rectangle;
import ru.courses.geometry.Square;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(1, 5, 5);
        Circle circle = new Circle(3, 4, 5);
        Rectangle rectangle = new Rectangle(4, 5, 4, 3);

        System.out.println(square);
        System.out.format("Площадь квадрата %d\n\n", square.getArea());

        System.out.println(circle);
        System.out.format("Площадь круга %d\n\n", circle.getArea());

        System.out.println(rectangle);
        System.out.format("Площадь прямоугольника %d\n\n", rectangle.getArea());
    }
}