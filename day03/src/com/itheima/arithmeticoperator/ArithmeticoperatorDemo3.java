package com.itheima.arithmeticoperator;

public class ArithmeticoperatorDemo3 {
    public static void main(String[] args) {
        //++ and --
        int a = 10;
        int b = a++;
        System.out.println(b);//10
        System.out.println(a);//11
        int c = ++a;
        System.out.println(c);//12
        a--;
        System.out.println(a);//11
        --a;
        System.out.println(a);//10
    }
}
