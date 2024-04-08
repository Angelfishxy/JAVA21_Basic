package com.itheima.listdemo;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> list = new ArrayList<> ();
        //增加
        boolean flag = list.add ("aaa");
        list.add ("bbb");
        list.add (1,"ccc");
        list.add ("ddd");
        System.out.println (flag);
        System.out.println (list);
        //删除
//        boolean result = list.remove ("aa");
//        System.out.println (result);
//        System.out.println (list);
        String str = list.remove (0);
        System.out.println (str);
        System.out.println (list);
        //改
        String re = list.set (1, "eee");
        System.out.println (re);
        System.out.println (list);

        //查
        String s = list.get (2);
        System.out.println (s);
        System.out.println (list);
        //遍历
        for (int i = 0; i < list.size (); i++) {
            String st = list.get (i);
            System.out.println (st);
        }

    }
}
