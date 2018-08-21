package com.gw.learn.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class ComTypeComparator implements Comparator<ComTypeComparator> {
    private Integer i;
    private Integer j;

    public ComTypeComparator() {
    }

    public ComTypeComparator(Integer i, Integer j) {
        this.i = i;
        this.j = j;
    }
    public static ComTypeComparator[] getArray(int arraySize){
        ComTypeComparator[] array = new ComTypeComparator[arraySize];
        Random random = new Random(1);
        for (int i = 0; i < arraySize; i++) {
            array[i] = new ComTypeComparator(random.nextInt(30),random.nextInt(30));
        }
        return array;
    }
    @Override
    public String toString() {
        return "("+i+","+j+")";
    }
    @Override
    public int compare(ComTypeComparator o1, ComTypeComparator o2) {
        //如果i相等，则比较j的大小
        return o1.i == o2.i ? (o1.j < o2.j ? -1 :(o1.j == o2.j ? 0 : 1)) :(o1.i < o2.i ? -1 :1) ;
    }

    public static void main(String[] args) {
        ComTypeComparator[] c = getArray(6);
        Arrays.sort(c,new ComTypeComparator());
        System.out.println(Arrays.toString(c));
    }
}
