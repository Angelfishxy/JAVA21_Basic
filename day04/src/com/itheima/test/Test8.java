package com.itheima.test;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        //除法实现

        Scanner sc = new Scanner(System.in);
        System.out.println ("请输入一个整数作为被除数");
        int dividend = sc.nextInt();
        System.out.println ("请输入一个整数作为除数");
        int divisor = sc.nextInt();
        int quotient = 0;
        int remainder = 0;
        while(dividend >= divisor){
            dividend -= divisor;
            quotient++;
        }
        remainder = dividend;
        System.out.println ("商为：" + quotient+'\n' + "余数为：" + remainder);
    }
}
