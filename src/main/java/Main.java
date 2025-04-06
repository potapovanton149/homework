import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        //Создаем инстанс класса Point3D и выводим строковое и хеш представление объекта
        Point3D point3D = new Point3D(1, 2, 3);
        System.out.println(point3D.toString());
        System.out.println(point3D.hashCode());
    }
}