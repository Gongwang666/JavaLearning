package com.gw.learn.generic.generator;

public class Coffee {
    private static long count = 0;
    private final long id = count++;

    @Override
    public String toString() {
        return getClass().getSimpleName()+":"+id;
    }
}
