package com.itheima.stringdemo;

public class StringDemo10 {
    //手机号隐私屏蔽
    //String substring
    public static void main(String[] args) {
        String phoneNumber = "12345679846";
        String frontNumber = phoneNumber.substring (0,3);
        String backNumber = phoneNumber.substring (7);

        String result = frontNumber+"****"+backNumber;
        System.out.println (result);
    }


}
