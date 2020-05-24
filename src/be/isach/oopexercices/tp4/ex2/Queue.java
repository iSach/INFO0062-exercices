package be.isach.oopexercices.tp4.ex2;

import be.isach.oopexercices.tp4.ex1.Node;

public class Queue<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public Queue() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void put(T value) {
        Node<T> newNode = new Node<>(value);

        if(head == null) { // Empty Queue
            head = newNode;
        } else {
            if (tail == null) { // Queue with one element
                head.setNext(newNode);
            } else {
                tail.setNext(newNode);
            }
            tail = newNode;
        }

        size++;
    }

    public T get() {
        if(head == null) {
            return null;
        }

        T value = head.getValue();

        head = head.getNext();
        size--;

        if(head == tail) {
            tail = null;
        }

        return value;
    }

    public T first() {
        if(head == null) {
            return null;
        }

        return head.getValue();
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        if(size == 0) return "Empty";

        StringBuilder sb = new StringBuilder();
        sb.append("(").append(size()).append("): ");

        Node<T> node = head;
        sb.append(node.getValue());
        while (node.getNext() != null) {
            node = node.getNext();
            sb.append("->").append(node.getValue());
        }

        return sb.toString();
    }
}
