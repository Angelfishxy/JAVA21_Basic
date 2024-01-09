package com.itheima.test;

import java.util.Scanner;

/**
 * @author Zxy
 */
public class Test2 {
    public static void main(String[] args) {
        /*数字6是一个伟大的数字，键盘录入两个整数，
        如果其中一个为6，最终结果输出为true；
        如果他们的和为6的倍数，最终结果输出为true；
        其他情况都是false。*/

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int num2 = sc.nextInt();
        boolean result = num1 == 6 || num2 == 6 || (num1 + num2) % 6 == 0;
        System.out.println("结果为" + result);
    }
}
