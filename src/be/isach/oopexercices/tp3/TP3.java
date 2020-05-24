package be.isach.oopexercices.tp3;

import be.isach.oopexercices.tp3.ex2.LineSegment;
import be.isach.oopexercices.tp3.ex3.PointCloud;

public class TP3 {

    public static void main(String... args) {
        System.out.println("---------- Exercise 2 ----------");
        ex2();
        System.out.println("\n\n");

        System.out.println("---------- Exercise 3 ----------");
        ex3();
    }

    private static void ex2() {
        LineSegment lineSegment = new LineSegment(1, 1, 5, 8);

        System.out.println(lineSegment);
        System.out.println("Length: " + lineSegment.length());
    }

    private static void ex3(){
        PointCloud pointCloud = new PointCloud();
        pointCloud.addPoint(0, 0);
        pointCloud.addPoint(3, 8);
        pointCloud.addPoint(12, 24);
        pointCloud.addPoint(53, 25);
        pointCloud.addPoint(12, 1);

        LineSegment[] segments = pointCloud.getTrajectory();
        for(LineSegment lineSegment : segments) {
            System.out.println(lineSegment.toString() + "    L=" + lineSegment.length());
        }
    }

}
