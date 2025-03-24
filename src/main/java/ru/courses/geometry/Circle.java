package ru.courses.geometry;

public class Circle extends Figure{

    public Circle(Point point, int dimension) {
        super(point, dimension);
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
