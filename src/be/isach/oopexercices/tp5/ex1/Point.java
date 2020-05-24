package be.isach.oopexercices.tp5.ex1;

public class Point {

    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void translate(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    public double getX() {
        return x;
    }

    public double    getY() {
        return y;
    }
}
