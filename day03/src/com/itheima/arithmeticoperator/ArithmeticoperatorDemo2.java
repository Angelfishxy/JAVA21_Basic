package com.itheima.arithmeticoperator;

public class ArithmeticoperatorDemo2 {
    public static void main(String[] args) {
        byte b1 = 100;
        byte b2 = 100;
        int result = b1 + b2;
        System.out.println(result);//200
        //强制类型转换
        byte result2 = (byte) (b1 + b2);
        System.out.println(result2);//-56
    }
}
