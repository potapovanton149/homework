package ru.courses.main;

import ru.courses.geometry.Line;
import ru.courses.geometry.Point2D;

public class Main {
    public static void main(String[] args) {
        Line line1 = new Line(1,2,3,4);
        Line line2 = new Line(1, 2, 3, 4);

        System.out.println(line1.equals(line2));
        System.out.println(line1.hashCode() == line2.hashCode());

        Line line3 = line1.clone();

        System.out.println(line1.equals(line3));
        System.out.println(line1.hashCode() == line3.hashCode());
    }
}
