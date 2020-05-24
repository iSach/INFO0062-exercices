package be.isach.oopexercices.tp4;

import be.isach.oopexercices.tp4.ex2.Queue;
import be.isach.oopexercices.tp4.ex3.Stack;

public class TP4 {

    public static void main(String... args) {
        System.out.println("---------- Exercise 2 (Queue) ----------");
        ex2();
        System.out.println("\n\n");

        System.out.println("---------- Exercise 3 (Stack) ----------");
        ex3();
    }

    private static void ex2() {
        Queue<Integer> queue = new Queue<>();
        System.out.println("Null?: " + queue.get());
        queue.put(7);
        System.out.println("7?: " + queue.get());
        queue.put(7);
        queue.put(12);
        System.out.println("7?: " + queue.first());
        System.out.println("7?: " + queue.get());
        System.out.println("12 ?: " + queue.get());

        System.out.println("----");

        System.out.println(queue);
        queue.put(7);
        System.out.println(queue);
        queue.get();
        queue.put(7);
        queue.put(12);
        queue.put(347);
        queue.get(); // removes the 7
        queue.put(1234);
        queue.put(15);
        System.out.println(queue);
    }

    private static void ex3() {
        Stack<Integer> stack = new Stack<>();
        stack.put(4);
        stack.put(13);
        System.out.println(stack.first()); // 13
        stack.put(23);
        System.out.println(stack.get()); // 23
        System.out.println(stack.get()); // 13
        System.out.println(stack.size()); // 1 (4)
        stack.put(16);
        System.out.println(stack.first()); // 16
        System.out.println(stack.get()); // 16
        System.out.println(stack.get()); // 4
        System.out.println(stack.get()); // null
    }

}
