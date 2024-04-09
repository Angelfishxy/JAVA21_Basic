package com.itheima.a05myset;

import java.util.TreeSet;

public class A06_TreeSetDemo2 {
    public static void main(String[] args) {
        //treeset底层数据结构：红黑树
        //treeset排序方式一（默认）：
        //student 实现接口Comparable，重写里面抽象方法，再指定规则
        Student s1 = new Student ("zhangsan",23);
        Student s2 = new Student ("lisi",24);
        Student s3 = new Student ("wangwu",25);

        TreeSet<Student> ts = new TreeSet<> ();

        ts.add (s1);
        ts.add (s2);
        ts.add (s3);

        System.out.println (ts);
    }
}
