package be.isach.oopexercices.tp3.ex1;

/*
 * INFO0062 - Object-Oriented Programming
 * Exercise series 3
 *
 * Exercise 1: reading the code of a simple Java program.
 *
 * @author: J.-F. Grailet
 */

public class CoordinatesTest
{
    public static void main(String[] args)
    {
        Coordinates a = new Coordinates(1, 2);
        Coordinates b = a;
        
        a.translate(3, 4);

        // Same
        System.out.println(a.toString());
        System.out.println(b.toString());


        // Modification
        Coordinates c = new Coordinates(1, 2);
        Coordinates d = new Coordinates(1, 2);

        c.translate(3, 4);

        System.out.println(c.toString());
        System.out.println(d.toString());

    }
}
