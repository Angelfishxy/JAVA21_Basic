package com.itheima.arraydemo;

public class ArrayDemo4 {
    public static void main(String[] args) {
        //动态初始化
        String[] arr = new String[50];
        arr[0] = "张三";
        arr[1] = "李四";
        System.out.println(arr[0]);
        System.out.println (arr[1]);
        System.out.println (arr[2]);

        //数组默认初始化值
        //整数类型 -> default : 0
        //浮点类型 -> default : 0.0
        //字符类型 -> default : \u0000 空格
        //布尔类型 -> default : false
        //引用类型 -> default : null
    }
}
