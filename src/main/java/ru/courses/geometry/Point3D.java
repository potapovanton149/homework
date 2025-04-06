package ru.courses.geometry;

import java.util.Objects;

public class Point3D extends Point2D {
    private int z;

    Point3D(int x, int y, int z){
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return String.format("{%d, %d, %d}", getX(), getY(), z);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Point3D)) return false;
        Point3D point3D = (Point3D) o;
        return getX() == point3D.getX() && getY() == point3D.getY() && z == point3D.z ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY(), z);
    }
}
