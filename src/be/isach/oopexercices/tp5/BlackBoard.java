package be.isach.oopexercices.tp5;/*
 * INFO0062 - Object-Oriented Programming
 * Exercise series 5
 *
 * This file is the basis for the exercises of the fifth series. To be exact, this is the code
 * which sets everything one needs to draw something within a small window. Besides the drawLine()
 * method of the Graphics2D class (instantiated here as "paintable"), students don't have to
 * invoke any other method from the classes involved in this program to solve the exercises.
 *
 * @author: J.-F. Grailet
 */

import be.isach.oopexercices.tp5.ex1.BrokenLine;
import be.isach.oopexercices.tp5.ex1.Point;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class BlackBoard {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Black board");
        JLabel display = new JLabel();

        // Frame settings
        frame.getContentPane().add(display, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Creates 400x400 picture (initally black)
        BufferedImage picture = new BufferedImage(600, 600, BufferedImage.TYPE_INT_RGB);
        Graphics2D paintable = picture.createGraphics();
        paintable.setColor(Color.white);

        /* This is where you are supposed to put your code ! */

        ex3(paintable);

        /* Note that you are not supposed to edit next lines. */

        // Displays the obtained picture
        display.setIcon(new ImageIcon(picture));
        frame.pack();
        frame.setVisible(true);
    }

    private static void drawPentagon(Graphics2D g) {
        drawPolygon(g, 5, 50);
    }

    private static void drawPolygon(Graphics2D g, int n, double size) {
        Point center = new Point(300, 300);
        center.translate(-size * 0.873, -2*size);
        BrokenLine brokenLine = new BrokenLine(center.getX(), center.getY());
        for (int i = 0; i < n; i++)
            brokenLine.addSegment(2 * Math.PI / n * i, size);
        brokenLine.draw(g);
    }

    // Figure 3
    private static void ex3(Graphics2D g) {
        Point center = new Point(300, 300);
        BrokenLine brokenLine = new BrokenLine(center.getX(), center.getY());
        for (int j = 0; j < 3; j++)
            brokenLine.addSegment(2 * Math.PI / 3 * j, 200);
        for(int i= 0; i < 12; i++) {
            brokenLine.draw(g);
            brokenLine.rotate(2 * Math.PI / 12);
            brokenLine.scale(0.9);
        }
    }
}
