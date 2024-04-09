package com.itheima.a05myset;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author Zxy
 */
public class A05_TreeSetDemo1 {
    public static void main(String[] args) {
        //treeset：无索引，不重复，可排序
        //对数值类型：integer，double等类型进行升序排序
        //对于字符，字符串类型：按照ascii码表进行升序排序
        TreeSet<Integer> ts = new TreeSet<> ();
        ts.add (1);
        ts.add (8);
        ts.add (4);
        ts.add (3);
        ts.add (13);
        ts.add (2);

        System.out.println (ts);
        
        //1.迭代器排序
        Iterator<Integer> it = ts.iterator ();
        while (it.hasNext ()){
            Integer i = it.next ();
            System.out.println (i);
        }
        System.out.println ("=========================");

        //2.增强for遍历
        for (Integer t : ts) {
            System.out.println (t);
        }
        System.out.println ("=========================");

        //3.lambda表达式遍历
        ts.forEach ( integer -> System.out.println (integer));
    }


}
