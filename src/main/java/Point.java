import java.util.Objects;

public class Point {
    final int X;
    final int Y;

    Point(int x, int y) {
        this.X = x;
        this.Y = y;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "X=" + X +
                ", Y=" + Y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Point)) return false;

        Point point = (Point) o;

        if (this.X == point.getX()
                && this.Y == point.getY()) return true;
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(X, Y);
    }
}
