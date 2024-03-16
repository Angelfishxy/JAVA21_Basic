package com.itheima.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test5 {
    //根据键盘录入添加arraylist
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<> ();
        Scanner sc = new Scanner (System.in);
        for (int i = 0; i < 3; i++) {
            Student s = new Student ();
            System.out.println ("请输入学生的姓名");
            String name = sc.next ();
            s.setName (name);
            System.out.println ("请输入学生的年龄");
            int age = sc.nextInt ();
            s.setAge (age);

            list.add (s);
        }
        System.out.println (list.size ());
    }
}
