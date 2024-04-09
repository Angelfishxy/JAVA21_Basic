package com.itheima.a05myset;

import java.util.LinkedHashSet;

public class A04_LinkedHashSetDemo {
    //linkedhashset：有序，不重复，无索引：增加双链表保证存取有序
    public static void main(String[] args) {
        Student s1 = new Student ("zhangsan",23);
        Student s2 = new Student ("lisi",24);
        Student s3 = new Student ("wangwu",25);
        Student s4 = new Student ("zhangsan",23);

        LinkedHashSet<Student> lhs = new LinkedHashSet<> ();

        System.out.println (lhs.add (s3));
        System.out.println (lhs.add (s2));
        System.out.println (lhs.add (s1));
        System.out.println (lhs.add (s4));

        System.out.println (lhs);
    }
}
