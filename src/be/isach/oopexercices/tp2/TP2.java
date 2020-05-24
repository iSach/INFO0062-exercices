package be.isach.oopexercices.tp2;

import static be.isach.oopexercices.tp2.ex123.PascalTriangle.*;


public class TP2 {

    public static void main(String... args) {
        System.out.println("C(3, 7) = " + get(3, 7));
        System.out.println("C(10, 7) = " + get(10, 7));
        System.out.println("C(42, 20) = " + get(42, 20));
        System.out.println("C(23, 11) = " + get(23, 11));
        System.out.println("C(12, -3) = " + get(12, -3));
        System.out.println("C(12, 4) = " + get(12, 4));
        System.out.println("C(12, 8) = " + get(12, 8));
        System.out.println("C(6, 0) = " + get(6, 0));
        System.out.println("C(6, 6) = " + get(6, 6));
    }

}
