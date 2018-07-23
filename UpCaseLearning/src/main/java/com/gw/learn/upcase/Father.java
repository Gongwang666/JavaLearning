package com.gw.learn.upcase;

public class Father {
    private void cry(){
        System.out.println("父亲哭了");
    }
    public void say(){
        System.out.println("我是父亲");
    }
    public void work(){
        System.out.println("父亲要为"+this+"工作挣钱");
    }
    public static void staticGet(){
        System.out.println("父亲的静态方法");
    }

    public static void main(String[] args) {
        //private方法被自动认为是final方法，对于所有导出类是屏蔽的。所以在Son中的cry方法被认为是一个新方法
        //而不是重写父类中的cry方法
        Father father = new Son();
        father.cry();
        //静态方法和域不具有多态性
        father.staticGet();
    }
}
