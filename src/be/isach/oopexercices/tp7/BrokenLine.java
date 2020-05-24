package be.isach.oopexercices.tp7;

import java.awt.*;

public class BrokenLine {

    private Point origin;
    private Segment head, tail;

    public BrokenLine(double x0, double y0) {
        this.origin = new Point(x0, y0);
        this.head = null;
        this.tail = null;
    }

    public void addSegment(double angle, double length) {
        Segment segment = new Segment(length, angle);

        if(head == null) {
            head = segment;
        } else {
            if(tail == null) {
                head.setNext(segment);
            } else {
                tail.setNext(segment);
            }
            tail = segment;
        }
    }

    public void translate(int dx, int dy) {
        this.origin.translate(dx, dy);
    }

    public void scale(double scale) {
        Segment curr = head;
        while(curr != null) {
            curr.scale(scale);
            curr = curr.getNext();
        }
    }

    public void rotate(double angle) {
        Segment curr = head;
        while(curr != null) {
            curr.rotate(angle);
            curr = curr.getNext();
        }
    }

    public void draw(Graphics2D g) {
        if (head == null)
            return;

        Segment curr = head;
        Point currPoint = origin;
        while (curr != null) {
            curr.draw(g, currPoint);
            currPoint = curr.getDestination(currPoint);
            curr = curr.getNext();
        }
    }

    public void transform(Transformation t) {
        if (head == null)
            return;

        Segment s = head;
        Segment last = null;
        while (s != null) {
            Segment next = s.getNext();
            last = t.transform(s);
            last.setNext(next);
            s = next;
        }
        tail = last;
    }

}
