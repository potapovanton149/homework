package ru.courses.geometry;

import java.util.Objects;

public class Point {
    private int x;

    public Point(int x){
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x){
        this.x = x;
    }

    @Override
    public String toString() {
        return String.format("{%d}", x);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Point)) return false;
        Point point = (Point) o;
        return x == point.x;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x);
    }
}
