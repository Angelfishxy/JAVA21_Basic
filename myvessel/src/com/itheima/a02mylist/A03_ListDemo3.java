package com.itheima.a02mylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class A03_ListDemo3 {
    public static void main(String[] args) {
        //List集合五种遍历方式

        List<String> list = new ArrayList<> ();
        list.add ("aaa");
        list.add ("bbb");
        list.add ("ccc");
        list.add ("ddd");

        //1.迭代器
        Iterator<String> it = list.iterator ();
        while (it.hasNext ()){
            System.out.println (it.next ());
        }
        System.out.println ("=========================");

        //2.增强for
        for (String s : list) {
            System.out.println (s);
        }
        System.out.println ("=========================");

        //3.lambda表达式
        list.forEach (s-> System.out.println (s));
        System.out.println ("=========================");

        //4.普通for
        for (int i = 0; i < list.size (); i++) {
            System.out.println (list.get (i));
        }
        System.out.println ("=========================");

        //5.列表迭代器
        //可以在迭代中添加add和删除remove元素
        ListIterator<String> lit = list.listIterator ();
        while (lit.hasNext ()){
            String str = lit.next ();
            System.out.println (str);
            if("bbb".equals (str)){
                lit.add ("qqq");
                lit.previous ();
            }
        }
        System.out.println (list);
    }
}
