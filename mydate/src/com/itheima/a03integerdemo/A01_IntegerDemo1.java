package com.itheima.a03integerdemo;

public class A01_IntegerDemo1 {
    public static void main(String[] args) {
        //构造方法
//        Integer i1 = new Integer (1);
//        Integer i2  =new Integer ("2");
//        System.out.println (i1);
//        System.out.println (i2);
//
//        Integer i3 = Integer.valueOf (123);
//        Integer i4 = Integer.valueOf ("123");
//        Integer i5 = Integer.valueOf ("123",8);
//        System.out.println (i3);
//        System.out.println (i4);
//        System.out.println (i5);
        //true
        Integer i6 = Integer.valueOf (127);
        Integer i7 = Integer.valueOf (127);
        System.out.println (i6 == i7);

        //false
        Integer i8 = Integer.valueOf (128);
        Integer i9 = Integer.valueOf (128);
        System.out.println (i8 == i9);

        //false
        Integer i10 = new Integer (127);
        Integer i11 = new Integer (127);
        System.out.println (i10 == i11);

        //false
        Integer i12 = new Integer (128);
        Integer i13 = new Integer (128);
        System.out.println (i12 == i13);
    }
}
