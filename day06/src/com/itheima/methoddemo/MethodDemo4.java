package com.itheima.methoddemo;

public class MethodDemo4 {
    public static void main(String[] args) {
        //带参数的函数调用
        sum(10,20);
        int a = 20;
        int b = 13;
        sum (a, b);
    }
    public static void sum(int a, int b){
        System.out.println (a + b);
    }

}
