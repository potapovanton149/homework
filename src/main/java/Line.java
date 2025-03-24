public class Line {
    private Point startLine;
    private Point endLine;

    public Point getStartLine() {
        return startLine;
    }

    public void setStartLine(Point startLine) {
        this.startLine = startLine;
    }

    public Point getEndLine() {
        return endLine;
    }

    public void setEndLine(Point endLine) {
        this.endLine = endLine;
    }

    Line(Point startLine, Point endLine) {
        this.startLine = startLine;
        this.endLine = endLine;
    }

    Line(int x1, int y1, int x2, int y2) {
        this.startLine = new Point(x1, y1);
        this.endLine = new Point(x2, y2);
    }

    public double getLenght(){
        double deltaX = endLine.getX() - startLine.getX();
        double deltaY = endLine.getY() - startLine.getY();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    @Override
    public String toString() {
        return "Линия от {X=" +
                startLine.getX() +
                ", Y=" +
                startLine.getY() +
                "} до {X=" +
                endLine.getX()+
                " Y=" +
                endLine.getY() +
                "}";
    }
}
