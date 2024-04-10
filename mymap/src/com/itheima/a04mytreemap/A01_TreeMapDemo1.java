package com.itheima.a04mytreemap;

import java.util.Comparator;
import java.util.TreeMap;

public class A01_TreeMapDemo1 {
    /*键：整数表示id
    值：字符串表示商品名称
    要求按照id升序排列、降序排列
     */
    public static void main(String[] args) {
        TreeMap<Integer,String > tm = new TreeMap<> (new Comparator<Integer> () {
            @Override
            public int compare(Integer o1, Integer o2) {
                //o1：当前添加的元素
                //o2：已经在红黑树中存在的元素
                //降序
                return o2 - o1;
            }
        });
        tm.put(5,"可口可乐");
        tm.put(4,"雪碧");
        tm.put(3,"六个核桃");
        tm.put(2,"康师傅");
        tm.put(1,"奥利奥");

        System.out.println (tm);

    }
}
