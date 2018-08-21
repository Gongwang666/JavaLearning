package com.gw.learn.array;

import java.util.Arrays;

public class ArrayCompare {
    public static void intArrayCompare(){
        int[] intArray = {5,2,8,20,4,7,1,2};
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));
    }
    public static void stringArrayCompare(){
        String[] stringArray = {"aa","bb","ab","dca","aac"};
        Arrays.sort(stringArray);
        System.out.println(Arrays.toString(stringArray));
    }
    public static void main(String[] args) {
        ArrayCompare.intArrayCompare();
        ArrayCompare.stringArrayCompare();
    }
}
