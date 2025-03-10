import java.util.ArrayList;
import java.util.List;


//Что нужно исправить:
//1. Объект должен содержать поле лист линий, а не точек
//2. Добавить конструктор класса если передан лист точек
//3. Переиспользовать код из класса Line при реализации метода расчета длины ломаной линии

public class PolyLine {
   List<Line> lineList;

    PolyLine() {
        lineList = new ArrayList<>();
    }

    PolyLine(List<Point> listPoint){
        lineList = new ArrayList<>();

        for (int i = 0; i < listPoint.size() - 1; i++) {
            Line line = new Line(listPoint.get(i), listPoint.get(i + 1));
            lineList.add(line);
        }
    }

    public Line[] getLines() {
        Line[] arrayLines = lineList.toArray(Line[]::new);

        for (int i = 0; i < lineList.size(); i++) {
            arrayLines[i] = lineList.get(i);
        }
        return arrayLines;
    }

    public double getLength() {
        double res = 0;
        Line line = new Line(0, 0, 0, 0);

        for (int i = 0; i < lineList.size(); i++) {
            line = lineList.get(i);
            res += line.getLenght();
        }
        return res;
    }

    @Override
    public String toString() {
        String res = "Линия [";
        int i = 1;
        for (Line line : lineList){
            res += "Линия " +
                    i + String.format(" {%d, %d : %d, %d}, ",
                    line.getStartLine().getX(),
                    line.getStartLine().getY(),
                    line.getEndLine().getX(),
                    line.getEndLine().getY());
            i++;
        }
        return res;
    }
}
