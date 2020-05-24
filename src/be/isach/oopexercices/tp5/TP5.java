package be.isach.oopexercices.tp5;

import be.isach.oopexercices.tp5.ex1.BrokenLine;

import java.awt.*;

public class TP5 {
    public static void main(String... args) {
        BrokenLine brokenLine = new BrokenLine(50, 80);
        brokenLine.addSegment(0, 50);
        brokenLine.addSegment(2 * Math.PI / 5, 50);
        brokenLine.addSegment(2 * Math.PI / 5, 50);
        brokenLine.addSegment(2 * Math.PI / 5, 50);
        brokenLine.addSegment(2 * Math.PI / 5, 50);
    }
}
