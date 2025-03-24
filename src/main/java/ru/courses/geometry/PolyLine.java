package ru.courses.geometry;

import java.util.ArrayList;
import java.util.List;

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

    public PolyLine fromPoint(List<Point> listPoint) {
        PolyLine polyLine = new PolyLine();
        polyLine.lineList = new ArrayList<>();

        for (int i = 0; i < listPoint.size() - 1; i++) {
            Line line = new Line(listPoint.get(i), listPoint.get(i + 1));
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
}