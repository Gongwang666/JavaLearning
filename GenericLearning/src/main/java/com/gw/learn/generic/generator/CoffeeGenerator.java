package com.gw.learn.generic.generator;

import java.util.Iterator;
import java.util.Random;
/**
 * 类名: CoffeeGenerator
 * 包名: com.gw.learn.generic.generator
 * 描述: 工厂模式实现
 * 作者: gongwang
 * 创建日期: 2018/7/28
 * 创建时间: 下午9:38
 **/
public class CoffeeGenerator implements Generator<Coffee>,Iterable<Coffee> {
    private Class[] classes = {Coffee.class,Latte.class,Mocha.class};
    private int size = 0;

    public CoffeeGenerator() {
    }

    public CoffeeGenerator(int size) {
        this.size = size;
    }

    @Override
    public Coffee next() {
        Random random = new Random();
        try {
            return (Coffee) classes[random.nextInt(3)].newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }
    class CoffeeIterator implements Iterator<Coffee>{
        int count = size;
        @Override
        public boolean hasNext() {
            return count>0;
        }

        @Override
        public Coffee next() {
            count -- ;
            return CoffeeGenerator.this.next();
        }
    }

    public static void main(String[] args) {
        CoffeeGenerator coffees = new CoffeeGenerator();
        for(int i = 0;i<5;i++){
            System.out.println(coffees.next());
        }
        System.out.println("---------------");
        //迭代器，实现Iterable接口
        for(Coffee coffee:new CoffeeGenerator(5)){
            System.out.println(coffee);
        }
    }
}
