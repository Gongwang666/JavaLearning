package com.gw.learn.upcase;

public class Son extends Father{
    /*public void say(){
        System.out.println("我是儿子");
    }*/
    public void cry(){
        System.out.println("儿子在哭");
    }
    public static void staticGet(){
        System.out.println("儿子的静态方法");
    }
    @Override
    public String toString() {
        return "儿子";
    }
}
