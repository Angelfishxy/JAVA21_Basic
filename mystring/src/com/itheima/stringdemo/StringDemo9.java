package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo9 {
    //金额转换：数字转换为中文大写金额
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money;
        String capital = "";
        while(true) {
            System.out.println ("请输入一个金额");
            money = sc.nextInt ();
            if (money >= 0 && money <= 9999999) {
                break;
            } else {
                System.out.println ("金额无效");
            }
        }
        while(true){
            int ge = money %10;
            String capitalNumber = getCapitalNumber (ge);
            capital = capitalNumber + capital;
            money /= 10;
            if(money == 0){
                break;
            }
        }

        int count = 7-capital.length ();

        for (int i = 0; i < count; i++) {
            capital = "零"+capital;
        }
        String moneystr = "";
        String[] arr = {"佰","拾","万","千","佰","拾","元"};
        for (int i = 0; i < capital.length (); i++) {
            moneystr = moneystr + capital.charAt (i)+ arr[i];
        }
        System.out.println (moneystr);
    }

    public  static String getCapitalNumber(int number){
        String[] arr = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        return arr[number];
    }
}
