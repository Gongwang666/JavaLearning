package com.gw.utils;

public interface List<E> extends Collection<E> {
    int size();

    boolean isEmpty();

    boolean clear();

    boolean contains(E e);
    //直接向末尾添加
    boolean add(E e);

    boolean remove(E e);

    Iterator<E> iterator();

    E set(int index,E e);

    E get(int index);
    //重载方法,向指定位置添加
    void add(int index,E e);
    //重载方法，删除指定位置的元素
    void remove(int index,E e);
}
