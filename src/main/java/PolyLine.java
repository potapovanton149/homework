import java.util.ArrayList;
import java.util.List;


//Что нужно исправить:
//1. Объект должен содержать поле лист линий, а не точек
//2. Добавить конструктор класса если передан лист точек
//3. Переиспользовать код из класса Line при реализации метода расчета длины ломаной линии

public class PolyLine {
    List<Line> lineList;

    private PolyLine() {
        lineList = new ArrayList<>();
    }

    public static PolyLine fromLines(List<Line> listLine) {
        PolyLine polyLine = new PolyLine();
        polyLine.lineList = listLine;
        return polyLine;
    }

    public static PolyLine fromPoint(List<Point> listPoint) {
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
        public double getLength () {
            double res = 0;
            for (Line value : lineList) {
                res += value.getLenght();
            }
            return res;
        }
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
