package com.itheima.a04mygenerics;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsDemo1 {
    public static void main(String[] args) {
        //泛型：集合添加数据时指定数据类型
        //如果没有对集合指定类型，默认所有数据类型Object。无法使用数据特有行为
        ArrayList list = new ArrayList ();
        list.add (123);
        list.add ("aaa");
        Student s1 = new Student ("zhangsan",23);
        list.add (s1);

        Iterator it = list.iterator ();
        while (it.hasNext ()){
            //无法获取子类的属性和方法
            Object obj = it.next ();
            System.out.println (obj);
        }
    }
}
