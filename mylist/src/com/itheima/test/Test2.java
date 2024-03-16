package com.itheima.test;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        //定义集合，添加数字，并进行遍历
        //基本数据类型对应包装类
        /*byte -> Byte
        short -> Short
        char -> Character
        int -> Integer
        long -> Long
        float -> Float
        double -> Double
        boolean -> Boolean
         */
        ArrayList<Integer> list = new ArrayList<> ();

        list.add (1);
        list.add (2);
        list.add (3);
        list.add (4);

        System.out.print ("[");
        for (int i = 0; i < list.size (); i++) {
            if(i == list.size ()-1){
                System.out.print(list.get (i)+"]");
            }else{
                System.out.print(list.get (i)+", ");
            }


        }
    }
}
