package com.itheima.a04mygenerics;

public class GenericsDemo2 {
    public static void main(String[] args) {
//        MyArrayList<String > list =new MyArrayList<> ();
//
//        list.add ("aaa");
//        list.add ("bbb");
//        list.add ("ccc");
//
//        System.out.println (list);

        MyArrayList<Integer> list = new MyArrayList<> ();
        list.add (1);
        list.add (2);
        list.add (3);

        System.out.println (list);


    }
}
