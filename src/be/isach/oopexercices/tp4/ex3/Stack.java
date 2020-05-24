package be.isach.oopexercices.tp4.ex3;

import be.isach.oopexercices.tp4.ex1.Node;

public class Stack<T> {

    // A<-B<-C<-Top
    private Node<T> top;
    private int size;

    public Stack() {
        this.top = null;
        this.size = 0;
    }

    public void put(T value) {
        top = new Node<>(value, top);
        size++;
    }

    public T get() {
        if (top == null) {
            return null;
        }

        T value = top.getValue();
        top = top.getNext();

        size--;

        return value;
    }

    public T first() {
        if (top == null) {
            return null;
        }

        return top.getValue();
    }

    public int size() {
        return size;
    }
}
