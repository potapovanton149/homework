package ru.courses.main;

import ru.courses.geometry.Line;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Line line1 = new Line(1, 1, 1, 1);
        Line line2 = new Line(2, 2, 2, 2);
        Line line3 = new Line(3, 3, 3, 3);

        List<Line> lineList1 = new ArrayList<>();
        lineList1.add(line1);
        lineList1.add(line2);
        lineList1.add(line3);


        Line line4 = new Line(1, 1, 1, 1);
        Line line5 = new Line(2, 2, 2, 2);
        Line line6 = new Line(3, 3, 3, 3);

        List<Line> lineList2 = new ArrayList<>();
        lineList2.add(line4);
        lineList2.add(line5);
        lineList2.add(line6);

        System.out.println(lineList1);
        System.out.println(lineList2);
        System.out.println(lineList1.equals(lineList2));
        System.out.println(lineList1.hashCode() == lineList2.hashCode());
    }
}
