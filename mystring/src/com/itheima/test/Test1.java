package com.itheima.test;

import java.util.Scanner;
import java.util.StringJoiner;

public class Test1 {
    //罗马数字转换
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        boolean flag =false;
        String str = "";
        while(! flag){
            System.out.println ("请输入一个数字");
            str = sc.next ();
            flag = checkStr (str);
            }
        StringBuilder sb = new StringBuilder ();
        for (int i = 0; i < str.length (); i++) {
            int index = str.charAt (i) - '0';
            sb.append(changeRomanNum (index)).append (" ");
        }
        System.out.println (sb);
    }

    public static boolean checkStr(String str){
        if(str.length ()>9){
            return false;
        }
        for (int i = 0; i < str.length (); i++) {
            char c = str.charAt (i);
            if(c < '0' || c>'9'){
                return  false;
            }
        }
        return true;
    }

    public static String changeRomanNum(int index){
        String[] arr = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        return  arr[index];
    }
}


