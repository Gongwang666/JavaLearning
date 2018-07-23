package com.gw.learn.random;

import java.util.Random;

public class RandomLearning {
    //当设定种子值后，每次产生的序列都是相同的
    public static void seedRandom(){
        Random random = new Random(1);
        for(int i =0;i<8;i++){
            System.out.print(random.nextInt(10)+",");
        }
    }
    public static void withOutSeedRandom(){
        Random random = new Random();
        for(int i =0;i<8;i++){
            System.out.print(random.nextInt(10)+",");
        }
    }
    public static void main(String[] args) {
        RandomLearning.seedRandom();
        System.out.println();
        RandomLearning.withOutSeedRandom();
    }
}
