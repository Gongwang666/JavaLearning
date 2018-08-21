package com.gw.learn.generic.tuple;

public class TupleTest {
    public static TwoTuple<Integer,String> f(){
        return new TwoTuple<Integer, String>(1,"张三");
    }
    public static ThreeTuple<Integer,String,Character> g(){
        return new ThreeTuple<Integer,String,Character>(2,"李四",'a');
    }

    public static void main(String[] args) {
        System.out.println(f());
        System.out.println(g());
    }
}
