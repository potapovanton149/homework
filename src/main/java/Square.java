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
