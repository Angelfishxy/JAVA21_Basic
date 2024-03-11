package com.itheima.stringbuilder;

import java.util.Scanner;

public class StringBuilderDemo3 {
    //链式编程
    public static void main(String[] args) {
        int len = getString ().substring (1).replace ("a","q").length ();
        System.out.println (len);
    }
    public static String getString(){
        Scanner sc= new Scanner (System.in);
        System.out.println ("请输入一个字符");
        String str = sc.next ();
        return  str;
    }
}
