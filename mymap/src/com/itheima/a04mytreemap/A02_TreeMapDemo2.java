package com.itheima.a04mytreemap;

import java.util.TreeMap;

public class A02_TreeMapDemo2 {
    /*
    键：学生对象
    值：籍贯
    按照学生年龄升序排列，年龄一样按姓名字母排列，同年龄同姓名视为同一个人
     */
    public static void main(String[] args) {
        TreeMap<Student, String> tm = new TreeMap<> ();
        Student s1 = new Student ("zhangsan", 23);
        Student s2 = new Student ("lisi", 24);
        Student s3 = new Student ("wangwu", 25);
        Student s4 = new Student ("chaoliu", 24);

        tm.put (s1, "江苏");
        tm.put (s2, "浙江");
        tm.put (s3, "北京");
        tm.put (s4, "辽宁");

        System.out.println (tm);
    }

}
