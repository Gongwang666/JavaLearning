package com.gw.learn.array;

import java.util.Arrays;
import java.util.Random;

public class CompareType implements Comparable<CompareType>{
    private Integer i;
    private Integer j;

    public CompareType(Integer i, Integer j) {
        this.i = i;
        this.j = j;
    }

    @Override
    public int compareTo(CompareType o) {
        return i < o.i ? -1 :(i == o.i ? 0 : 1);
    }

    @Override
    public String toString() {
        return "("+i+","+j+")";
    }

    public static CompareType[] getArray(int arraySize){
        CompareType[] array = new CompareType[arraySize];
        Random random = new Random(1);
        for(int i = 0; i < arraySize;i++){
            array[i] = new CompareType(random.nextInt(30),random.nextInt(30));
        }
        return array;
    }

    public static void main(String[] args) {
        CompareType[] array = getArray(6);
        //对于数组元素是对象的数组（即不是基本类型的），类必须实现Comparable接口，否则会抛出ClassCastException
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
