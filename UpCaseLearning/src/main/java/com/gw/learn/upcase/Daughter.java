package com.gw.learn.upcase;

public class Daughter extends Father {
    public void say(){
        System.out.println("我是女儿");
    }
    public static void staticGet(){
        System.out.println("女儿的静态方法");
    }
    @Override
    public String toString() {
        return "女儿";
    }
}
