package be.isach.oopexercices.tp6.ex1;/*
 * INFO0062 - Object-Oriented Programming
 * Exercise series 6
 *
 * Exercise 1: reading a small program involving inheritance.
 *
 * @author: J.-F. Grailet
 */

public class TestPizza
{
    public static void main(String args[])
    {
        Pizza np = new NonnaPizza();
        MargheritaPizza mp = new ReginaPizza();
        NonnaPizza hp = new HawaiianPizza();
        hp.addExtra("Pepperoni");
        
        // What will these lines print and why ?
        System.out.println("Ingredients for np:\n" + np.getRecipe());
        System.out.println("Ingredients for mp:\n" + mp.getRecipe());
        System.out.println("Ingredients for hp:\n" + hp.getRecipe());
    }
}
