package be.isach.oopexercices.tp11.ex3;/*
 * INFO0062 - Object-Oriented Programming
 * Exercise series 11
 *
 * Exercise 3: simulation of the monitoring of a jogging.
 * 
 * Comments:
 * -This exercise involves several threads: one thread models the monitor displaying the time 
 *  taken by each runner to finish the race while all other threads will model the runners. This 
 *  situation is a practical case to see the wait() and notify() / notifyAll() methods in action.
 * -This class just provides a main() method to test the code.
 *
 * @author: J.-F. Grailet
 */

public class Jogging
{
    public static void main(String[] args)
    {
        FinishLine line = new FinishLine();
        
        new Monitor(8, line).start(); // Expects 8 joggers
        
        new Runner("Willy", 15, 10.9, line).start();
        new Runner("Raoul", 15, 12.5, line).start();
        new Runner("Frederic", 15, 13.3, line).start();
        new Runner("Christine", 15, 12.9, line).start();
        new Runner("Daniel", 15, 14.6, line).start();
        new Runner("Caroline", 15, 14.0, line).start();
        new Runner("Julie", 15, 12.6, line).start();
        new Runner("Sybille", 15, 11.5, line).start();
        
        System.out.println("The jogging has started !");
    }
}
