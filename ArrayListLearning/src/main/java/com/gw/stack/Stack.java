package com.gw.stack;

import java.util.LinkedList;

public class Stack<E> {
    private LinkedList<E> l = new LinkedList<>();

    public void push(E e){
        l.addFirst(e);
    }
    public E peek(){
        return l.getFirst();
    }
    public E pop(){
        return l.removeFirst();
    }

    @Override
    public String toString() {
        return l.toString();
    }
}
