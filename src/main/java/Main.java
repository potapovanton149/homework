import ru.courses.geometry.*;


public class Main {
    public static void main(String[] args) {
        ExtendedPoint3D extendedPoint3D_1 = ExtendedPoint3D.of(3,"красного");
        System.out.println(extendedPoint3D_1);

        ExtendedPoint3D extendedPoint3D_2 = ExtendedPoint3D.of(4,2, 5, 11, 0);
        System.out.println(extendedPoint3D_2);

        ExtendedPoint3D extendedPoint3D_3 = ExtendedPoint3D.of(7, 7, "желтого", 15, 35);
        System.out.println(extendedPoint3D_3);
    }
}