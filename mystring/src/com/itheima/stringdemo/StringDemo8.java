package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo8 {
    //字符串反转
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String str = sc.next ();
        System.out.println (stringReverse (str));
    }

    public static java.lang.String stringReverse(java.lang.String str){

        java.lang.String result = "";
        for (int i = str.length ()-1; i >= 0; i--) {
            result += str.charAt (i);
        }
        return result;
    }
}
