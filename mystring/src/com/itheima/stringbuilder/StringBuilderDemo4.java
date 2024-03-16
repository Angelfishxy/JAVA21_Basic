package com.itheima.stringbuilder;

import java.util.Scanner;

public class StringBuilderDemo4 {
    //判断回文数
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println ("请输入一个字符串");
        String str = sc.next ();
        StringBuilder sb = new StringBuilder (str);
        boolean result = sb.reverse ().toString ().equals (str);
        System.out.println (result);

    }
}
