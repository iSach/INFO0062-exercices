package be.isach.oopexercices.tp7;/*
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
        Graphics2D g = picture.createGraphics();
        g.setColor(Color.white);

        /* This is where you are supposed to put your code ! */

        BrokenLine bl = new BrokenLine(50, 300);
        bl.addSegment(0, 500);
        for(int i = 0; i < 7; i++) {
            bl.transform(new SquareVariantTransform());
        }
        bl.draw(g);

        /* Note that you are not supposed to edit next lines. */

        // Displays the obtained picture
        display.setIcon(new ImageIcon(picture));
        frame.pack();
        frame.setVisible(true);
    }
}
