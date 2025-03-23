import java.util.ArrayList;
import java.util.List;

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
        NewString newString =  new NewString("Объект");


        List<Measurable> measurables = new ArrayList<>();
        measurables.add(polyLine);
        measurables.add(closedPolyLine);
        measurables.add(newString);

        System.out.println("Сумма длины всех объектов:\n" + Main.totalLengthLine(measurables));
    }
}