package com.itheima.test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        //电话预定飞机票

        Scanner sc = new Scanner (System.in);
        System.out.println ("请输入你的选择");
        int choose = sc.nextInt();
        switch(choose){
            case 1 -> System.out.println ("机票查询");
            case 2 -> System.out.println ("机票预定");
            case 3 -> System.out.println ("机票改签");
//            case 4 -> System.out.println ("退出服务");
            default -> System.out.println ("退出服务");
        }
    }
}
