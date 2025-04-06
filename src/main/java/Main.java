import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Point> pointList = new ArrayList<Point>();

        pointList.add(new Point(1, 5));
        pointList.add(new Point(2, 8));
        pointList.add(new Point(5, 3));
        pointList.add(new Point(8, 9));

        Point[] pointsArray = pointList.toArray(new Point[0]);

        ClosedPolyLine closedPolyLine = new ClosedPolyLine(pointsArray);

        System.out.println("Создаем замкнутую линию, проходящую через точки {1;5}, {2;8}, {5;3}, {8,9}:\n" + closedPolyLine);
        System.out.println("\nРассчитываем длину замкнутой линии: \n" + closedPolyLine.getLength());
    }
}