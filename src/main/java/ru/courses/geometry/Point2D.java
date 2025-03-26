package ru.courses.geometry;

import java.util.Objects;

public class Point2D extends Point {
    private int y;

    Point2D(int x, int y) {
        super(x);
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void setY(int y){
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("{%d;%d}", y);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Point2D)) return false;
        Point2D point2D = (Point2D) o;
        return getX() == point2D.getX() && y == point2D.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), y);
    }
}