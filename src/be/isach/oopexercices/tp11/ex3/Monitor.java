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
 * -The Monitor class models the monitor that should display the names of the joggers along their 
 *  time when they cross the finish line.
 *
 * @author: J.-F. Grailet
 */

public class Monitor extends Thread
{
    private int nbRunners; // Expected amount of runners
    private FinishLine finish; // Finish line to monitor
    
    public Monitor(int nbRunners, FinishLine finish)
    {
        super("Finish line monitor for " + nbRunners + " runners");
        this.nbRunners = nbRunners;
        this.finish = finish;
    }
    
    public void run()
    {
        int seen = 0;
        while(seen < nbRunners)
        {
            System.out.println(finish.getResult());
            seen++;
        }
    }
}
