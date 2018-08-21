package com.gw.arraylist;


//import com.gw.utils.ArrayList;

import com.gw.Pet;

import java.util.*;

public class LearningArrayList {
    public static void removeEle(){
        String[] name = {"Cat","Dog"};
        List<Pet> list = new ArrayList<Pet>();
        for(int i = 0;i<name.length;i++){
            Pet pet = new Pet(i,name[i]);
            list.add(pet);
        }
        System.out.println(list);
        Pet pet = new Pet(0,"Cat");
        System.out.println(list.contains(pet));
        //删除时会调用equals方法，所以Pet重写了equals方法
        list.remove(pet);
        System.out.println(list);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        LinkedList<Integer> lk = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.addAll(list);
        System.out.println(list);
        //list.set(-1,0);
        //removeEle();
        /*Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()){
            itr.next();
            itr.remove();
        }*/
    }
}
