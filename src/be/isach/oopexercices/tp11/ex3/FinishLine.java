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
 * -The FinishLine class implements the TimeReporting interface and uses the wait() / notify() 
 *  methods such that a Monitor thread can wait for a result and be notified when one is ready.
 * -To fully understand this code, review carefully the very last slides of Chapter 9.
 *
 * @author: J.-F. Grailet
 */

import java.util.Vector;

public class FinishLine implements TimeReporting
{
    private Vector<String> results;
    
    public FinishLine()
    {
        results = new Vector<String>();
    }
    
    public synchronized String getResult()
    {
        while(results.size() == 0)
        {
            try
            {
                wait();
            }
            catch(InterruptedException e) { }
        }
        String res = results.get(0);
        results.remove(0);
        return res;
    }
    
    public synchronized void report(String res)
    {
        results.add(res);
        notify();
    }
}
