package com.itheima.mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class A06_CollectionDemo6 {
    public static void main(String[] args) {
        //增强for
        Collection<String> coll = new ArrayList<> ();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");

        //s为第三方变量，不会更改原集合中的数据
//        for(String s :coll){
//            System.out.println (s);
//        }
        for (String s : coll) {
            System.out.println (s);
        }
    }
}
