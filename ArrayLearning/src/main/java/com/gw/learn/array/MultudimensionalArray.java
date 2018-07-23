package com.gw.learn.array;

import java.util.Arrays;
import java.util.Random;

public class MultudimensionalArray {
    //创建一个二维双精度数组,a为第一维度的长度，b为第二维度的长度
    public double[][] createTwoDimDoubleArray(int a,int b,double start,double end){
        double[][] array = new double[a][b];
        Random random = new Random();
        for(int i = 0;i<a;i++){
            for(int j = 0;j<b;j++){
                array[i][j] = start+((end-start)*random.nextDouble());
            }
        }
        return array;
    }

    public static void main(String[] args) {
        MultudimensionalArray m = new MultudimensionalArray();
        double[][] array =  m.createTwoDimDoubleArray(2,2,2.0,3.0);
        System.out.println(Arrays.deepToString(array));
    }
}
