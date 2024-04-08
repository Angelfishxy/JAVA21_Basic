package com.itheima.a03integerdemo;

import java.util.Scanner;

public class A05_IntegerDemo5 {
    //键盘录入改进
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String line = sc.nextLine ();
        int i = Integer.parseInt (line);
        System.out.println (i);

    }
}
