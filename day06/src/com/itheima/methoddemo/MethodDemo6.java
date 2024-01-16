package com.itheima.methoddemo;

public class MethodDemo6 {
    public static void main(String[] args) {
        //带返回值的方法的调用
        int result = getSum (6,7);
        System.out.println (result);
    }
    public static int getSum(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
