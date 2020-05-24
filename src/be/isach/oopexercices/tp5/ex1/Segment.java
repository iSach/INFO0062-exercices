package be.isach.oopexercices.tp5.ex1;

import java.awt.*;

public class Segment {

    private double length, angle;
    private Segment next;

    public Segment(double length, double angle, Segment next) {
        this.length = length;
        this.angle = angle;
        this.next = next;
    }

    public Segment(double length, double angle) {
        this(length, angle, null);
    }

    public double getAngle() {
        return angle;
    }

    public double getLength() {
        return length;
    }

    public Segment getNext() {
        return next;
    }

    public void setNext(Segment next) {
        this.next = next;
    }

    public Point getDestination(Point origin) {
        double toX = origin.getX() + length * Math.cos(angle);
        double toY = origin.getY() + length * Math.sin(angle);
        return new Point(toX, toY);
    }

    public void draw(Graphics2D g, Point origin) {
        Point to = getDestination(origin);
        g.drawLine((int) origin.getX(), (int) origin.getY(),
                (int) to.getX(), (int) to.getY());
    }

    public void scale(double scale) {
        this.length *= scale;
    }

    public void rotate(double angle) {
        this.angle += angle;
    }
}
