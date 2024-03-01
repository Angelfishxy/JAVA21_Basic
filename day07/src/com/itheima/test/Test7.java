package com.itheima.test;

import java.util.Scanner;

public class Test7 {
    //把一个整数每一位数字添加到数组中
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println ("请输入一个正整数：");
        int num = sc.nextInt ();
        int tmp = num;
        int count = 0;
        while(tmp != 0){
            count++;
            tmp /= 10;
        }
        int[] arr = new int[count];
        for(int i =1; i<=count; i++){
            arr[count-i] = num%10;
            num /= 10;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println (arr[i]);
        }
    }
}
