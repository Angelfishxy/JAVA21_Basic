package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo4 {
    //用户登录模拟
    public static void main(String[] args) {
        String rightUsername = "zxyburenshu";
        String rightPassword = "123456";

        Scanner sc = new Scanner (System.in);

        for (int i =0;i<3;i++) {
            System.out.println ("请输入用户名：");
            String username = sc.next ();
            System.out.println ("请输入密码：");
            String password = sc.next ();

            if(username.equals (rightUsername) && password.equals (rightPassword)){
                System.out.println ("用户登录成功");
                break;
            }else{
                if (i == 2) {
                    System.out.println ("账户"+username+"已经被锁定");
                }else{
                    System.out.println ("登录失败，用户名或密码有误。你还剩"+(2-i)+"次机会");
                }

            }
        }
    }
}
