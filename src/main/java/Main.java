import java.util.Arrays;
import java.util.HashMap;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        City a = new City("a");
        City b = new City("b");
        City c = new City("c");
        City d = new City("d");
        City e = new City("e");
        City f = new City("f");

        a.addPath(b, 5);
        a.addPath(d, 6);
        a.addPath(f, 1);


        b.addPath(a,5);
        b.addPath(c, 3);

        c.addPath(b, 3);
        c.addPath(d, 4);

        d.addPath(a, 6);
        d.addPath(c, 4);
        d.addPath(e, 2);

        e.addPath(f, 2);

        f.addPath(b, 1);
        f.addPath(e, 2);


        System.out.println("1. Если передано число 1, результат должен быть либо A, либо С:\n" + (b.travelBy(1)));
        System.out.println("\n2. Если передано число 2, результат должен быть либо B, либо D, либо F:\n" + b.travelBy(2));
        System.out.println("\n3.Если передано число 3, результат может быть любом городом:\n" + (b.travelBy(3)));

        b.setOfPaths.remove(c);
        f.setOfPaths.remove(e);
        System.out.println("\n4.Настройте объекты городов так, чтобы при передаче числа 3 последним городом оказался город A:\n" + (e.travelBy(3)));

    }
}
