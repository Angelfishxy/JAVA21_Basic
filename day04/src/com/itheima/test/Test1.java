package com.itheima.test;

public class Test1 {
    public static void main(String[] args) {
        //自动驾驶判断
        //根据红绿灯的颜色，来判断是否可以通行

        boolean isLightGreen = false;
        boolean isLightRed = false;
        boolean isLightYellow = true;
        if (isLightGreen) {
            System.out.println ("gogogo!");
        }
        if (isLightRed) {
            System.out.println ("stop!");
        }
        if(isLightYellow) {
            System.out.println ("slow down!");
        }
    }
}
