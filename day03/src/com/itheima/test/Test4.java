package com.itheima.test;

public class Test4 {
    public static void main(String[] args) {
        //比较三个人的身高

        int height1 = 150;
        int height2 = 210;
        int height3 = 165;

        int tmp = height1 > height2 ? height1 : height2;
        int max = tmp > height3 ? tmp : height3;
        System.out.println ("最高的人的身高是：" + max);
    }
}
