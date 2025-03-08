import java.util.Arrays;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(1, 5);
        Point point2 = new Point(2, 8);
        Point point3 = new Point(5, 3);
        Point point4 = new Point(8, 9);

        PolyLine polyLine = new PolyLine();

        polyLine.pointList.add(point1);
        polyLine.pointList.add(point2);
        polyLine.pointList.add(point3);
        polyLine.pointList.add(point4);

        System.out.println("1.Создать Ломаную, проходящую через точки {1;5}, {2;8}, {5;3}, {8,9}:\n" + polyLine);


        System.out.println("\n\n\n2. Рассчитать длину Ломаной: \n" + polyLine.getLength());


        System.out.println("\n\n\n3. Получить у Ломаной массив Линий:\n" + Arrays.toString(polyLine.getLines()));


        Point[] arrayPoints = polyLine.getLines();
        double lengthArrayPoints = 0;
        for (int i = 0; i < arrayPoints.length - 1; i++) {
            double deltaX = arrayPoints[i + 1].getX() - arrayPoints[i].getX();
            double deltaY = arrayPoints[i + 1].getY() - arrayPoints[i].getY();
            lengthArrayPoints += Math.sqrt(deltaX * deltaX + deltaY * deltaY);
        }
        System.out.println("\n\n\n4. Рассчитать длину массива Линий:\n" + lengthArrayPoints);


        System.out.println("\n\n\n5. Сравнить длину Ломаной и массива Линий:\n" + (lengthArrayPoints == polyLine.getLength()));


        point2.setX(12);
        System.out.println(String.format("\n\n\n6. Изменить координаты Точки {2,8} таким образом, чтобы она стала иметь значение {12,8}. \n\n" +
                        "Точка %s \nЛоманая %s \nМассив %s", point2, polyLine, Arrays.toString(polyLine.getLines())));
    }
}