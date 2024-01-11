package com.itheima.test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        //计算范围内既能被3整除，又能被5整除的数有多少个

        int count = 0;
        Scanner sc = new Scanner (System.in);
        System.out.println ("请输入一个整数表示下限");
        int min = sc.nextInt ();
        System.out.println ("请输入一个整数表示上限");
        int max = sc.nextInt ();
        for(int i = min;i <= max;i++){
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println (i);
                count++;
            }
        }
        System.out.println ("范围内既能被3整除，又能被5整除的数有" + count + "个");
    }
}
