package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo6 {
    //统计字符串大写字符、小写字母、数字出现的次数
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println ("请输入一个字符串");
        String str = sc.next ();
        int higherCount =0;
        int lowerCount = 0;
        int numCount = 0;
        for (int i = 0; i < str.length (); i++) {
            char c = str.charAt (i);
            //System.out.println (c);
            if(c >= 'a' && c<='z'){
                lowerCount++;
            }else if(c>='A' && c <= 'Z'){
                higherCount++;
            }else if(c>='0' && c<='9'){
                numCount++;
            }
        }
        System.out.println ("小写字符数："+lowerCount);
        System.out.println ("大写字符数："+higherCount);
        System.out.println ("数字字符数："+numCount);

    }
}
