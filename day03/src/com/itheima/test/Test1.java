package com.itheima.test;

import java.util.Scanner;

/**
 * @author Zxy
 */
public class Test1 {
    public static void main(String[] args) {
        //键盘录入一个三位数，获取其个位，十位，百位上的数字
        //公式：个位数：num % 10


        //      十位数：num / 10 % 10
        //      百位数：num / 100 % 10
        //...

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int num = sc.nextInt();
        System.out.println("个位数为：" + num % 10);
        System.out.println("十位数为：" + num / 10 % 10);
        System.out.println("百位数为：" + num / 100 % 10);
        float a = 1.0001F;
        System.out.println((int) a);

    }
}
