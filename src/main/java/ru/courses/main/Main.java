package ru.courses.main;

import ru.courses.geometry.Point2D;

public class Main {
    public static void main(String[] args) {
        Point2D point1 = new Point2D(1, 2);
        Point2D point2 = point1.clone();


        System.out.println(point1.hashCode() == point2.hashCode());
        System.out.println(point1.equals(point2));
    }
}