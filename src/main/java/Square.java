/**
 * Задание звучит "Выполнить требование инкапсуляции", поэтому решил отсебятину добавить:
 * 1. Вместо полей x и y использовал класс Point (переиспользование кода)
 * 2. Добавил два конструктора с возможностью создания объекта через две точки или класс Point
 * 3. Перегрузил два сеттера с возможностью передачи аргумента в виде двух точек или объекта класса Point
 */
public class Square {
    private Point point;
    private int sideLength;

    public void setPoint(Point point) {
        this.point = point;
    }

    public void setPoint(int x, int y) {
        this.point = new Point(x, y);
    }

    public void setSideLength(int sideLength) {
        if (sideLength <= 0) {
            throw new IllegalArgumentException("Длина квадрата не может быть меньше или равно 0");
        }
        this.sideLength = sideLength;
    }

    public int getSideLength() {
        return sideLength;
    }

    public Point getPoint() {
        return point;
    }

    public Square(Point point, int sideLength) {
        if (sideLength <= 0) {
            throw new IllegalArgumentException("Длина квадрата не может быть меньше или равно 0");
        }
        this.point = point;
        this.sideLength = sideLength;
    }

    public Square(int x, int y, int sideLength) {
        if (sideLength <= 0) {
            throw new IllegalArgumentException("Длина квадрата не может быть меньше или равно 0");
        }
        this.point = new Point(x, y);
        this.sideLength = sideLength;
    }

    @Override
    public String toString() {
        return String.format("Квадрат в точке %s со стороной %d", point.toString(), sideLength);
    }
}
