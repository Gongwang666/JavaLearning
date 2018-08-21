package com.gw.learn.array;

import com.gw.learn.TestClass;

import java.util.Arrays;

/**
 * 类名: ArraysClassLearning
 * 包名: com.gw.learn.array
 * 描述: Arrays实用功能学习
 * 作者: gongwang
 * 创建日期: 2018/7/24
 * 创建时间: 下午9:53
 **/
public class ArraysClassLearning {
    //浅拷贝
    public static void arrayShallowCopy(){
        TestClass[] array = new TestClass[3];
        for(int i=0;i<array.length;i++){
            array[i] = new TestClass(""+i);
        }
        TestClass[] newArray = new TestClass[3];
        System.arraycopy(array,0,newArray,0,3);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(newArray));
        //对象的引用相同
        System.out.println(array[1]==newArray[1]);
    }
    public static void arrayEquals(){
        int[] a1 = {1,2,3};
        int[] a2 = {1,2,3};
        System.out.println(Arrays.equals(a1,a2));
        String[] b1 = {"q","w","e"};
        String[] b2 = {"q","w","e"};
        String[] b3 = {new String("q"),new String("w"),new String("e")};
        System.out.println(Arrays.equals(b1,b2));
        System.out.println(Arrays.equals(b1,b3));
        TestClass[] t1 = {new TestClass("1"),new TestClass("2"),new TestClass("3")};
        TestClass[] t2 = {new TestClass("1"),new TestClass("2"),new TestClass("3")};
        System.out.println(Arrays.equals(t1,t2));
    }
    public static void main(String[] args) {
        ArraysClassLearning.arrayShallowCopy();
        System.out.println();
        ArraysClassLearning.arrayEquals();
    }
}
