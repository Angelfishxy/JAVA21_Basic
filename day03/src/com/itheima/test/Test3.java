package com.itheima.test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        /*需求：动物园里有两只老虎，体重分别通过键盘录入获得，
        请实现判断两只老虎的体重是否相同
         */

        Scanner sc = new Scanner (System.in);
        System.out.println ("请输入第一只老虎的体重：");
        int weight1 = sc.nextInt ();
        System.out.println ("请输入第二只老虎的体重：");
        int weight2 = sc.nextInt ();
        System.out.println (weight1 == weight2 ? "相同" : "不同");
    }
}
