package ru.courses.geometry;


public class ExtendedPoint3D {
    private Point3D point3D;
    private Color color;
    private Timestamp timestamp;

    private ExtendedPoint3D(Point3D point, Color color, Timestamp timestamp) {
        this.point3D = point;
        this.color = color;
        this.timestamp = timestamp;
    }


    /// для трех точек с передачей цвета
    public static ExtendedPoint3D ofColor(int x, String color) {
        return new ExtendedPoint3D(new Point3D(x, 0, 0), new Color(color), null);
    }

    public static ExtendedPoint3D ofColor(int x, int y, String color) {
        return new ExtendedPoint3D(new Point3D(x, y, 0), new Color(color), null);
    }


    public static ExtendedPoint3D ofColor(int x, int y, int z, String color) {
        return new ExtendedPoint3D(new Point3D(x, y, z), new Color(color), null);
    }

    /// для трех точек с передачей времени
    public static ExtendedPoint3D ofTime(int x, int hour, int minute) {
        return new ExtendedPoint3D(new Point3D(x, 0, 0), null, new Timestamp(hour, minute));
    }

    public static ExtendedPoint3D ofTime(int x, int y, int hour, int minute) {
        return new ExtendedPoint3D(new Point3D(x, y, 0), null, new Timestamp(hour, minute));
    }


    public static ExtendedPoint3D ofTime(int x, int y, int z, int hour, int minute) {
        return new ExtendedPoint3D(new Point3D(x, y, z), null, new Timestamp(hour, minute));
    }

    /// для трех точек с передачей и цвета и времени
    public static ExtendedPoint3D ofColorAndTime(int x, String color, int hour, int minute) {
        return new ExtendedPoint3D(new Point3D(x, 0, 0), new Color(color), new Timestamp(hour, minute));
    }

    public static ExtendedPoint3D ofColorAndTime(int x, int y, String color, int hour, int minute) {
        return new ExtendedPoint3D(new Point3D(x, y, 0), new Color(color), new Timestamp(hour, minute));
    }


    public static ExtendedPoint3D ofColorAndTime(int x, int y, int z, String color, int hour, int minute) {
        return new ExtendedPoint3D(new Point3D(x, y, z), new Color(color), new Timestamp(hour, minute));
    }


    /// тутушки дичь получилась, но лучше не придумал((
    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Точка в координате ");

        if (point3D.getZ() == 0 && point3D.getY() == 0){
            res.append(point3D.getX());
        }

        if (point3D.getZ() == 0 && point3D.getY() != 0){
            res.append(String.format("{%d, %d}", point3D.getX(), point3D.getY()));
        }

        if (point3D.getZ() != 0){
            res.append(point3D.toString());
        }

        if (timestamp != null) {
            res.append(" в ").append(timestamp);
        }

        if (color != null) {
            res.append(", ").append(color).append(" цвета");
        }

        return res.toString();
    }
}
