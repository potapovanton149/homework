import java.util.ArrayList;
import java.util.List;

public class PolyLine {
   List<Point> pointList;

    PolyLine() {
        pointList = new ArrayList<>();
    }

    public Point[] getLines() {
        Point[] arrayPoints = new Point[pointList.size()];

        for (int i = 0; i < pointList.size(); i++) {
            arrayPoints[i] = pointList.get(i);
        }
        return arrayPoints;
    }

    public double getLength() {
        double res = 0;
        Line line = new Line(0, 0, 0, 0);

        for (int i = 0; i < pointList.size() - 1; i++) {
            line.setStartLine(pointList.get(i));
            line.setEndLine(pointList.get(i+1));
            res += line.getLenght();
        }
        return res;
    }

    @Override
    public String toString() {
        String res = "Линия [";
        int i = 1;
        for (Point point : pointList){
            res += "Точка " +
                    i + String.format(" {%d, %d}, ",
                    point.getX(),
                    point.getY());
            i++;
        }
        return res;
    }
}
