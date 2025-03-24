import ru.courses.geometry.Circle;
import ru.courses.geometry.Figure;
import ru.courses.geometry.Rectangle;
import ru.courses.geometry.Square;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static int sumAllAreas(List<Figure> figureList) {
        int sumAll = 0;
        for (Figure figure : figureList) {
            sumAll += figure.getArea();
        }
        return sumAll;
    }

    public static void main(String[] args) {
        Square square1 = new Square(1, 5, 5);
        Circle circle1 = new Circle(3, 4, 5);
        Rectangle rectangle1 = new Rectangle(4, 5, 4, 3);

        Square square2 = new Square(3, 3, 3);
        Circle circle2 = new Circle(3, 4, 4);
        Rectangle rectangle2 = new Rectangle(4, 5, 4, 3);

        Square square3 = new Square(1, 5, 5);
        Circle circle3 = new Circle(3, 4, 5);
        Rectangle rectangle3 = new Rectangle(4, 6, 6, 5);

        List<Figure> list = new ArrayList<>();
        list.add(square1);
        list.add(circle1);
        list.add(rectangle1);
        list.add(square2);
        list.add(circle2);
        list.add(rectangle2);
        list.add(square3);
        list.add(circle3);
        list.add(rectangle3);


        System.out.format("Общая площадь фигур переданная в список: %d", sumAllAreas(list));
    }
}