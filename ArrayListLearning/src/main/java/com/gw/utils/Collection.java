package com.gw.utils;

public interface Collection<E> extends Iterable<E>{
    int size();
    boolean isEmpty();
    boolean clear();
    boolean contains(E e);
    boolean add(E e);
    boolean remove(E e);
    Iterator<E> iterator();
}
