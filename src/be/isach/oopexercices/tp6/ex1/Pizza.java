package be.isach.oopexercices.tp6.ex1;/*
 * INFO0062 - Object-Oriented Programming
 * Exercise series 6
 *
 * Exercise 1: reading a small program involving inheritance.
 *
 * @author: J.-F. Grailet
 */

import java.util.Vector;

public abstract class Pizza
{
    protected Vector<String> ingredients;

    public Pizza()
    {
        ingredients = new Vector<String>();
        ingredients.add("Mozzarella");
        
        // Note: not all pizzas have tomatoes (cf. white pizza).
    }
    
    public void addExtra(String ingredient)
    {
        ingredients.add(ingredient);
    }
    
    public String getRecipe()
    {
        String recipe = "";
        for(int i = 0; i < ingredients.size(); i++)
        {
            if(i > 0)
                recipe += ", ";
            recipe += ingredients.get(i);
        }
        return recipe;
    }
}
