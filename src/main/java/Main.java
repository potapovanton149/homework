import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Point> pointList = new ArrayList<Point>();

        pointList.add(new Point(1, 5));
        pointList.add(new Point(2, 8));
        pointList.add(new Point(5, 3));
        pointList.add(new Point(8, 9));

        PolyLine polyLine = PolyLine.fromPoint(pointList);


        System.out.println("1.Создать Ломаную, проходящую через точки {1;5}, {2;8}, {5;3}, {8,9}:\n" + polyLine);

        System.out.println("\n\n\n2. Рассчитать длину Ломаной: \n" + polyLine.getLength());

        System.out.println("\n\n\n3. Получить у Ломаной массив Линий:\n" + Arrays.toString(polyLine.getLines()));


        Line[] arrayPoints = polyLine.getLines();
        double lengthArrayPoints = 0;
        for (int i = 0; i < arrayPoints.length; i++) {
           lengthArrayPoints += arrayPoints[i].getLenght();
        }
        System.out.println("\n\n\n4. Рассчитать длину массива Линий:\n" + lengthArrayPoints);


        System.out.println("\n\n\n5. Сравнить длину Ломаной и массива Линий:\n" + (lengthArrayPoints == polyLine.getLength()));


        polyLine.lineList.get(0).getEndLine().setX(12);
        System.out.println(String.format("\n\n\n6. Изменить координаты Точки {2,8} таким образом, чтобы она стала иметь значение {12,8}. \n\n" +
                        "Точка %s \nЛоманая %s \nМассив %s", polyLine.lineList.get(0).getEndLine().getX(), polyLine, Arrays.toString(polyLine.getLines())));
    }
}