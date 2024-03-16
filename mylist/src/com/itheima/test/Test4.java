package com.itheima.test;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<> ();
        Student st1 = new Student ("zhangsan", 24);
        Student st2 = new Student ("lisi", 26);
        Student st3 = new Student ("wangwu", 27);

        list.add (st1);
        list.add (st2);
        list.add (st3);

        for (int i = 0; i < list.size (); i++) {
            Student stu = list.get (i);
            System.out.println (stu.getName ()+stu.getAge ());
        }

    }
}
