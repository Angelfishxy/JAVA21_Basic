package com.itheima.logicoperator;

public class LogicoperatorDemo {
    public static void main(String[] args) {
        // and -> &
        System.out.println(true & true);//true
        System.out.println(true & false);//false
        System.out.println(false & true);//false
        System.out.println(false & false);//false

        // or -> |
        System.out.println(true | true);//true
        System.out.println(true | false);//true
        System.out.println(false | true);//true
        System.out.println(false | false);//false

    }
}
