package com.itheima.a01staticdemo1;

public class StudentTest {
    public static void main(String[] args) {
        //static静态变量，被该类所有对象共享，可以用类名调用
        //新增属性：老师姓名·
        Student.teacherName = "awei";
        Student stu1 = new Student ();
        stu1.setName ("zhagnsan");
        stu1.setAge (23);
        stu1.setGender ("male");

        stu1.study ();
        System.out.println (stu1.toString ());

        Student stu2 = new Student ("lisi", 24, "female");
        stu2.study ();
        System.out.println (stu2.toString ());
    }
}
