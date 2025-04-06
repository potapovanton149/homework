package ru.courses.geometry;

abstract public class Figure {
    private Point2D point2D;
    private int dimension;

    public Point2D getPoint() {
        return point2D;
    }

    public int getDimension() {
        return dimension;
    }

    public Figure(Point2D point2D, int sideLength) {
        this.point2D = point2D;
        this.dimension = sideLength;
    }

    public Figure(int x, int y, int sideLength) {
        this.point2D = new Point2D(x, y);
        this.dimension = sideLength;
    }

    abstract public int getArea();
}

