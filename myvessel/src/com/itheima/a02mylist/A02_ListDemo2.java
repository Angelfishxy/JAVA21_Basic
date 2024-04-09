package com.itheima.a02mylist;

import java.util.ArrayList;
import java.util.List;

public class A02_ListDemo2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<> ();
        list.add (1);
        list.add (2);
        list.add (3);


        //list.remove (1);
        System.out.println (list);

        //手动装箱
        Integer i = Integer.valueOf (1);
        list.remove (i);
        System.out.println (list);
    }
}
