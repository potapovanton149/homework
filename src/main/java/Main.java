import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;

public class Main {
    public static double totalLengthLine(List<Measurable> Measurable) {
        double totalLengthLine = 0;
        for (Measurable measurable : Measurable) {
            totalLengthLine += measurable.getLength();
        }
        return totalLengthLine;
    }

    public static void main(String[] args) {
        List<Point> pointList = new ArrayList<Point>();

        pointList.add(new Point(1, 5));
        pointList.add(new Point(2, 8));
        pointList.add(new Point(5, 3));
        pointList.add(new Point(8, 9));

        Point[] pointsArray = pointList.toArray(new Point[0]);

        PolyLine polyLine = new PolyLine().fromPoint(pointList);
        ClosedPolyLine closedPolyLine = new ClosedPolyLine(pointsArray);

        List<Measurable> measurables = new ArrayList<>();
        measurables.add(polyLine);
        measurables.add(closedPolyLine);


        System.out.println("Создаем замкнутую линию, проходящую через точки {1;5}, {2;8}, {5;3}, {8,9}:\n" + closedPolyLine);
        System.out.println("\nРассчитываем длину замкнутой линии: \n" + closedPolyLine.getLength());

        System.out.println("\n\n\nСоздаем ломаную линию, проходящую через точки {1;5}, {2;8}, {5;3}, {8,9}:\n" + polyLine);
        System.out.println("\nРассчитываем длину ломаной линии: \n" + polyLine.getLength());

        System.out.println("\n\n\nСумма длины всех объектов:\n" + Main.totalLengthLine(measurables));
    }
}