package ru.courses.geometry;

abstract public class Figure {
    private Point point;
    private int dimension;

    public Point getPoint() {
        return point;
    }

    public int getDimension() {
        return dimension;
    }

    public Figure(Point point, int sideLength) {
        this.point = point;
        this.dimension = sideLength;
    }

    public Figure(int x, int y, int sideLength) {
        this.point = new Point(x, y);
        this.dimension = sideLength;
    }

    abstract public int getArea();
}

