package com.itheima.a02mylist;

import java.util.ArrayList;
import java.util.List;

public class A01_ListDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<> ();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        System.out.println (list);
        //添加元素到指定位置，后面元素以此后移一位
        list.add (1,"QQQ");
        System.out.println (list);

        //按位删除
//        String remove = list.remove (0);
//        System.out.println (remove);
//        System.out.println (list);

        //按位更改
        String result = list.set (0, "QQQ");
        System.out.println (result);
        System.out.println (list);

        //按位查找
        String s = list.get (0);
        System.out.println (s);
    }
}
