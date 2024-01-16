package com.itheima.methoddemo;

public class MethodDemo5 {
    public static void main(String[] args) {
        //求长方形的周长
        getLength (5.35,56.6);
    }
    public static void getLength(double len,double width){
        double result = (len + width) * 2;
        System.out.println ("长方形的周长是：" + result);
    }

}
