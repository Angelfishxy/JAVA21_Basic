package com.itheima.a05myset;

public class A02_HashSetDemo1 {
    //hashset：无序，无索引，不重复的
    //散列表：数组+链表+红黑树（方便查找，链表长度大于8且数组长度大于等于64时，链表自动转换为红黑树）
    //对于自定义对象，重写equals。hashcode函数

    public static void main(String[] args) {
        Student s1 =new Student ("zhangsan",23);
        Student s2 =new Student ("zhangsan",23);

         //如果没有重写hashcode方法，默认对对象地址进行计算，得到hash值不同
        System.out.println (s1.hashCode ());
        System.out.println (s2.hashCode ());

        //不同属性值或地址值计算出来的哈希值可能相同：哈希碰撞
        System.out.println ("abc".hashCode ());
        System.out.println ("acD".hashCode ());
    }


}
