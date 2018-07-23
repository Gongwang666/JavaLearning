package com.gw.arraylist;


//import com.gw.utils.ArrayList;

import java.util.ArrayList;

public class LearningArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.set(-1,0);
        /*Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()){
            itr.next();
            itr.remove();
        }*/
    }
}
