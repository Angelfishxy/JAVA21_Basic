package com.itheima.logicoperator;

public class LogicoperatorDemo2 {
    public static void main(String[] args) {
        //1.&& 短路与

        System.out.println(true && true); //true
        System.out.println(true && false); //false
        System.out.println(false && true); //false
        System.out.println(false && false); //false
        System.out.println("\n");

        //2.|| 短路或
        System.out.println(true || true); //true
        System.out.println(true || false); //true
        System.out.println(false || true); //true
        System.out.println(false || false); //false

        int a = 10;
        int b = 10;
        boolean result = ++a <5 && ++b < 5;
        System.out.println(a);
        System.out.println(b);

    }
}
