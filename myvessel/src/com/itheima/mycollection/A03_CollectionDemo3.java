package com.itheima.mycollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class A03_CollectionDemo3 {
    public static void main(String[] args) {
        //迭代器
        Collection<String> coll = new ArrayList<> ();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");

        Iterator<String> it = coll.iterator ();
        while (it.hasNext ()){
            //next获取元素，移动指针
            String str = it.next ();
            System.out.println (str);
        }
    }
}