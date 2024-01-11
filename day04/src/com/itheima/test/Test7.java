package com.itheima.test;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        //回文数判断

        Scanner sc = new Scanner (System.in);
        System.out.println ("请输入一个整数");
        int num = sc.nextInt ();
        int num1 = num;
        int result = 0;
        while(num1 % 10 >0){
            int temp = num1 % 10;
//            System.out.println (temp);
            result = result*10 + temp;
//            System.out.println (result);
            num1 /= 10;
        }
//        System.out.println (result);
        if(result == num) {
            System.out.println (num+"是回文数");
        }else{
            System.out.println (num+"不是回文数");
        }



    }
}
