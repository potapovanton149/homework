package ru.courses.geometry;

public class Circle extends Figure{

    public Circle(Point2D point2D, int dimension) {
        super(point2D, dimension);
    }

    public Circle(int x, int y, int dimension){
        super(x, y, dimension);
    }

    public int getArea(){
        return (int) (Math.PI * getDimension() * getDimension());
    }

    @Override
    public String toString() {
        return String.format("Круг в точке %s со радиусом %d", getPoint().toString(), getDimension());
    }
}
