package com.itheima.a05myset;

import java.util.TreeSet;

public class A07_TreeSetDemo3 {
    //treeset排序方式二：
    //自定义排序方式comparator比较器排序
    public static void main(String[] args) {
        //按照字符串长度进行排序

        TreeSet<String > ts = new TreeSet<> ((o1,o2)-> {
                int len = o1.length () - o2.length ();
                len = len == 0 ? o1.compareTo (o2) : len;
                return len;
            }
        );
        ts.add ("c");
        ts.add ("ab");
        ts.add ("df");
        ts.add ("qwer");

        System.out.println (ts);
    }
}
