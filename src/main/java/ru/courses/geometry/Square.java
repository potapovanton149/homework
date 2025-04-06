package ru.courses.geometry;

public class Square extends Figure{

    public Square(Point2D point2D, int dimension) {
        super(point2D, dimension);
    }

    public Square(int x, int y, int dimension){
        super(x, y, dimension);
    }

    public int getArea(){
        return getDimension() * getDimension();
    }

    @Override
    public String toString() {
        return String.format("Квадрат в точке %s со стороной %d", getPoint().toString(), getDimension());
    }
}
