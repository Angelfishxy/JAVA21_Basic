package com.itheima.switchdemo;

public class SwitchDemo2 {
    public static void main(String[] args) {
        //switch可以省略，位置一般为最后一行

        int number = 2;
        switch (number){
            case 1:
                System.out.println ("number的值为1");
                break;
            case 10:
                System.out.println ("number的值为10");
                break;
            case 20:
                System.out.println ("number的值为20");
                break;

            default:
                System.out.println ("没有匹配的值");
                break;

        }

    }
}
