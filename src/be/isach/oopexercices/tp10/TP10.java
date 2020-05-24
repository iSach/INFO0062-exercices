package be.isach.oopexercices.tp10;

import be.isach.oopexercices.tp10.ex1.NumbersCollection;
import be.isach.oopexercices.tp10.ex2.Lexicon;

public class TP10 {

    public static void main(String... args) {
        // Ex1
        NumbersCollection<Integer> nc = new NumbersCollection<>();
        nc.add(123);
        nc.add(13);
        nc.add(3);
        System.out.println(nc.arithmeticMean());
        System.out.println(nc.geometricMean());
        System.out.println(nc.harmonicMean());

        // Ex2
        Lexicon<Integer> lexicon = new Lexicon<>();
        lexicon.add("Sacha", 5);
        lexicon.add("Sacaa", 4);
        lexicon.add("A", 2);
        lexicon.add("Jean", 3);
        System.out.println(lexicon);
        lexicon.add("ZZZZZ", 0);
        System.out.println(lexicon);
    }

}
