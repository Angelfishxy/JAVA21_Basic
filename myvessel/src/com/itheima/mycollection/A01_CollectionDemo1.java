package com.itheima.mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class A01_CollectionDemo1 {
    public static void main(String[] args) {
        //collection 是一个接口，不能直接创建他的对象
        Collection<String> coll = new ArrayList<> ();
        //1.添加
        // list集合里添加时，返回值为true，允许有重复
        //set集合里添加数据时，当添加数据不存在时，返回true；若已存在，添加失败，返回false。不允许有重复；
        coll.add ("aaa");
        coll.add ("bbb");
        coll.add ("ccc");
        coll.add ("ddd");

        System.out.println (coll);

        //2.清空
        //coll.clear ();
        //System.out.println (coll);

        //3.删除
        //collection不能通过索引进行删除，只能通过元素的对象进行删除
        coll.remove ("aaa");
        System.out.println (coll);

        //4.contains 判断元素是否包含
        //对于自定义类进行判断，需要重写equals方法
        boolean result = coll.contains ("bbb");
        System.out.println (result);

        //5.判空
        boolean result1 = coll.isEmpty ();
        System.out.println (result1);

        //6.获取集合长度
        int size = coll.size ();
        System.out.println (size);
    }
}
