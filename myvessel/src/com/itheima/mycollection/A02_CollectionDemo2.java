package com.itheima.mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class A02_CollectionDemo2 {
    public static void main(String[] args) {
        Collection<Student> coll = new ArrayList<> ();
        Student s1 = new Student ("zhangsan",23);
        Student s2 = new Student ("lisi",24);
        Student s3 = new Student ("wangwu",25);

        coll.add (s1);
        coll.add (s2);
        coll.add (s3);

        Student s4 = new Student ("zhangsan",23);

        boolean result = coll.contains (s4);
        //需要在自定义javabean类中重写eaquals方法
        System.out.println (result);
    }
}
