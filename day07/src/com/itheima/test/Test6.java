package com.itheima.test;

import java.util.Scanner;


public class Test6 {
    /*数字加密，每位数+5，%10，最后将数字反转，得到加密数字*/
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println ("请输入一个整数：");
        int num = sc.nextInt ();
        //获取数字的位数+
        

    }
    public static int encode(int[] arr){
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = (i + 5)%10;
            arr[i] = num;
        }
        for (int i = 0; i < arr.length; i++) {
            number = number*10 + arr[i];
        }
        return number;
    }
}
