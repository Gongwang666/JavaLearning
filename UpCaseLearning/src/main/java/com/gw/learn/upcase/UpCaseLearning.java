package com.gw.learn.upcase;

public class UpCaseLearning {
    public static void main(String[] args) {
        //向上转型，如果子类中重写了父类中的方法，则在调用该方法时，调用的时子类中的方法
        //向上转型后不能调用父类中没有的方法
        Father father = new Son();
        Father daughter = new Daughter();
        father.say();
        daughter.say();
        father.work();
        daughter.work();

    }
}
