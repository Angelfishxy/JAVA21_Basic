package com.itheima.stringdemo;

public class StringDemo11 {
    //身份证信息查看
    public static void main(String[] args) {
        String id = "321281202001011234";
        String year = id.substring (6,10);
        String month = id.substring (10,12);
        String date = id.substring (12,14);
        char gender = id.charAt (16);
        int num = gender - '0';
        System.out.println ("人物信息为：");
        System.out.println ("出生年月日："+year+"年"+month+"月"+date+"日");
        if(num%2 == 0){
            System.out.println ("性别为：女");
        }else{
            System.out.println ("性别为：男");
        }
    }
}
