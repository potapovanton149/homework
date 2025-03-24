package ru.courses.geometry;

public class Rectangle extends Figure{
   private int dimension2;

    public int getDimension2() {
        return dimension2;
    }

    public Rectangle(Point point, int dimension, int dimension2) {
        super(point, dimension);
        this.dimension2 = dimension2;
    }

    public Rectangle(int x, int y, int dimension, int dimension2){
        super(x, y, dimension);
        this.dimension2 = dimension2;
    }

    public int getArea(){
        return dimension2 * getDimension();
    }

    @Override
    public String toString() {
        return String.format("Прямоугольник в точке %s и со сторонами %d и %d", getPoint().toString(), getDimension(), dimension2);
    }
}
