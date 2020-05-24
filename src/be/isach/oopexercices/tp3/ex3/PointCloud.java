package be.isach.oopexercices.tp3.ex3;

import be.isach.oopexercices.tp3.ex1.Coordinates;
import be.isach.oopexercices.tp3.ex2.LineSegment;

import java.util.Vector;

public class PointCloud {

    private Vector<Coordinates> points;

    public PointCloud() {
        this.points = new Vector<>();
    }

    public void addPoint(int x, int y) {
        points.add(new Coordinates(x, y));
    }

    public void translate(int dx, int dy) {
        for(Coordinates c : points)
            c.translate(dx, dy);
    }

    public LineSegment[] getTrajectory() {
        if(points.size() == 0) {
            return null;
        }

        int sz = points.size() - 1;
        LineSegment[] segments = new LineSegment[sz];

        for(int i = 0; i < sz; i++) {
            int x1 = points.get(i).getX();
            int y1 = points.get(i).getY();
            int x2 = points.get(i+1).getX();
            int y2 = points.get(i+1).getY();

            segments[i] = new LineSegment(x1, y1, x2, y2);
        }

        return segments;
    }

}
