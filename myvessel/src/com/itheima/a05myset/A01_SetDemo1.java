package com.itheima.a05myset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class A01_SetDemo1 {
    public static void main(String[] args) {

        //set集合无序，不重复，没有索引
        //创建set对象
        Set<String> s =new HashSet<> ();


        //可以去重，添加非重复数据时返回true。添加重复数据时返回false
        boolean re1 = s.add ("aaa");
        boolean re2 = s.add ("aaa");
        s.add ("bbb");
        s.add ("ccc");
        s.add ("ddd");

        System.out.println (re1);
        System.out.println (re2);

        System.out.println (s);

        //迭代器遍历
        Iterator<String> it =s.iterator ();
        while (it.hasNext ()){
            String str = it.next ();
            System.out.println (str);
        }
        System.out.println ("===================");

        //增强for遍历
        for (String str : s) {
            System.out.println (str);
        }
        System.out.println ("===================");

        //lambda表达式遍历
        s.forEach (str -> System.out.println (str));

    }
}
