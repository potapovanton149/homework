package ru.courses.geometry;

public class Line implements Measurable {
    private Point2D startLine;
    private Point2D endLine;

    public Point2D getStartLine() {
        return startLine;
    }

    public void setStartLine(Point2D startLine) {
        this.startLine = startLine;
    }

    public Point2D getEndLine() {
        return endLine;
    }

    public void setEndLine(Point2D endLine) {
        this.endLine = endLine;
    }

    Line(Point2D startLine, Point2D endLine) {
        this.startLine = startLine;
        this.endLine = endLine;
    }

    Line(int x1, int y1, int x2, int y2) {
        this.startLine = new Point2D(x1, y2);
        this.endLine = new Point2D(x2, y2);
    }

    public double getLength(){
        double deltaX = endLine.getX() - startLine.getX();
        double deltaY = endLine.getY() - startLine.getY();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    @Override
    public String toString() {
        return String.format("Линия от {X=%d, Y=%d} до {X=%d,  Y=%d}",
                startLine.getX(),
                startLine.getY(),
                endLine.getX(),
                endLine.getY());
    }
}