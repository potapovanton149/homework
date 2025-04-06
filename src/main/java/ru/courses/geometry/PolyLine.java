package ru.courses.geometry;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PolyLine implements Measurable {
    protected List<Line> lineList;

    protected PolyLine() {
        lineList = new ArrayList<>();
    }

    public PolyLine fromLines(List<Line> listLine) {
        PolyLine polyLine = new PolyLine();
        polyLine.lineList = listLine;
        return polyLine;
    }

    public PolyLine fromPoint(List<Point2D> listPoint2D) {
        PolyLine polyLine = new PolyLine();
        polyLine.lineList = new ArrayList<>();

        for (int i = 0; i < listPoint2D.size() - 1; i++) {
            Line line = new Line(listPoint2D.get(i), listPoint2D.get(i + 1));
            polyLine.lineList.add(line);
        }

        return polyLine;
    }

    public Line[] getLines() {
        Line[] arrayLines = lineList.toArray(new Line[lineList.size()]);
        return arrayLines;
    }

    public double getLength() {
        double res = 0;
        for (Line value : lineList) {
            res += value.getLength();
        }
        return res;
    }

    @Override
    public String toString() {
        String res = "Линия [";
        int i = 1;
        for (Line line : lineList) {
            res += "Линия " + i + String.format(" {%d, %d : %d, %d}, ", line.getStartLine().getX(), line.getStartLine().getY(), line.getEndLine().getX(), line.getEndLine().getY());
            i++;
        }
        return res;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        PolyLine polyLine = (PolyLine) o;

        Line[] lineList1 = lineList.toArray(new Line[0]);
        Line[] lineList2 = polyLine.lineList.toArray(new Line[0]);

        if (lineList2.length != lineList1.length){return false;}

        boolean res = true;

        for (int i = 0; i < lineList.size(); i++) {
            if(lineList1[i] == lineList2[i]){
                break;
            }
        }

        return res;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(lineList);
    }
}