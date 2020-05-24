package be.isach.oopexercices.tp9;

import be.isach.oopexercices.tp9.ex2.Group;
import be.isach.oopexercices.tp9.ex2.Person;

public class TP9 {

    public static void main(String... args) {
        Person p1 = new Person("Salut", "ça");
        Person p2 = new Person("va", "moi");
        Person p3 = new Person("oui", "non", "je");
        Person p4 = new Person("ne", "sais");
        Person p5 = new Person("pas", "???");
        Person p6 = new Person("yo", "lo");

        Group g1 = new Group();
        g1.add(p1);
        g1.add(p2);
        System.out.println("g1: " + g1);
        Group g2 = (Group) g1.clone();
        System.out.println("g1 = son clone ? : " + g1.equals(g2));

        g2.remove(p2);
        g2.add(p3);
        System.out.println("g1 = son clone ? : " + g1.equals(g2));

    }

}
