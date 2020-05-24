package be.isach.oopexercices.tp3.ex2;

import be.isach.oopexercices.tp3.ex1.Coordinates;

public class LineSegment {

    private final Coordinates from, to;

    public LineSegment(int x1, int y1, int x2, int y2) {
        this.from = new Coordinates(x1, y1);
        this.to = new Coordinates(x2, y2);
    }

    public void translate(int dx, int dy) {
        from.translate(dx, dy);
        to.translate(dx, dy);
    }

    public double length() {
        return Math.sqrt(Math.pow((from.getX() - to.getX()), 2) +
                Math.pow((from.getY() - to.getY()), 2));
    }

    @Override
    public String toString() {
        return "[" + from.toString() + ", " + to.toString() + "]";
    }
}
