package com.itheima.a01mymap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class A05_HashMapDemo1 {
    public static void main(String[] args) {
        //存储自定义对象
        //键添加学生对象。值添加籍贯，同姓名同年龄视为同一学生
        //HashMap：同HashSet底层数据结构：数组+链表+红黑树
        //依据键，无序，不重复，无索引
        HashMap<Student, String> hm = new HashMap<> ();

        Student s1 = new Student ("zhangsan", 23);
        Student s2 = new Student ("lisi", 24);
        Student s3 = new Student ("wagnwu", 25);
        Student s4 = new Student ("wagnwu", 25);


        hm.put (s1, "江苏");
        hm.put (s2, "辽宁");
        hm.put (s3, "浙江");
        hm.put (s4, "山东");

        Set<Student> keys = hm.keySet ();
        for (Student key : keys) {
            System.out.println (key + " = " + hm.get (key));
        }
        System.out.println ("===================");

        Set<Map.Entry<Student, String>> entries = hm.entrySet ();
        for (Map.Entry<Student, String> entry : entries) {
            System.out.println (entry.getKey () + " = " + entry.getValue ());
        }
        System.out.println ("===================");

        hm.forEach ((student, value) -> System.out.println (student + " = " + value));
    }
}
